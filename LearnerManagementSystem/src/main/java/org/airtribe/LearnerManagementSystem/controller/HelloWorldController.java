package org.airtribe.LearnerManagementSystem.controller;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import java.util.List;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.exception.LearnerNotFoundException;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

  private LearnerManagementService learnerManagementService;

  @Autowired
  public void setLearnerManagementService(LearnerManagementService learnerManagementService) {
    this.learnerManagementService = learnerManagementService;
  }

  @GetMapping("/")
  public String helloWorld() {
    return "Hello world!";
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello from LearnerManagementSystem!";
  }

  @PostMapping("/learners")
  public Learner createLearner(@Valid @RequestBody Learner learner) {
    return learnerManagementService.createLearner(learner);
  }

  @GetMapping("/learners")
  public List<Learner> getLearner(
      @RequestParam(value = "learnerId", required = false) Long learnerId,
      @RequestParam(value="learnerName", required = false) String learnerName) throws LearnerNotFoundException {
    if (learnerId == null && learnerName == null) {
      return learnerManagementService.getAllLearners();
    }
    if (learnerId != null) {
      Learner learner =  learnerManagementService.findLearnerById(learnerId);
      return List.of(learner);
    }

    Learner learner =  learnerManagementService.findLearnerByName(learnerName);
    return List.of(learner);

  }

  @PutMapping("/learners")
  public Learner updateLearner(@RequestBody Learner learner) {
    return learnerManagementService.updateLearner(learner);
  }


  @ExceptionHandler(LearnerNotFoundException.class)
  public ResponseEntity<String> handleLearnerNotFoundException(LearnerNotFoundException ex) {
    return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
  }

}
