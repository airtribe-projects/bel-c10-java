package org.airtribe.LearnerManagementSystem.service;

import java.util.List;
import java.util.Optional;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.exception.LearnerNotFoundException;
import org.airtribe.LearnerManagementSystem.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LearnerManagementService {

  @Autowired
  private LearnerRepository learnerRepository;

  public Learner createLearner(Learner learner) {
    return learnerRepository.save(learner);
  }

  public List<Learner> getAllLearners() {
    return learnerRepository.findAll();
  }

  public Learner findLearnerById(Long learnerId) throws LearnerNotFoundException {
    Optional<Learner> learner = learnerRepository.findById(learnerId);
    if (learner.isPresent()) {
      return learner.get();
    }

    throw new LearnerNotFoundException("Learn not found, incorrect id provided " + learnerId);
  }

  public Learner findLearnerByName(String learnerName) {
    return learnerRepository.findByLearnerName(learnerName);
  }

  public Learner updateLearner(Learner learner) {
    Learner existingLearner = learnerRepository.findById(learner.getLearnerId()).get();
    existingLearner.setName(learner.getName());
    existingLearner.setAddress(learner.getAddress());
    existingLearner.setPhone(learner.getPhone());
    existingLearner.setEmail(learner.getEmail());
    return learnerRepository.save(existingLearner);
  }
}
