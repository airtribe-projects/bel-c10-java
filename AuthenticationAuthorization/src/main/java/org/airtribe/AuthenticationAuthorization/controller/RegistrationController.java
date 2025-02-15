package org.airtribe.AuthenticationAuthorization.controller;

import jakarta.servlet.http.HttpServletRequest;
import java.util.UUID;
import org.airtribe.AuthenticationAuthorization.entity.User;
import org.airtribe.AuthenticationAuthorization.model.UserPojo;
import org.airtribe.AuthenticationAuthorization.service.UserService;
import org.airtribe.AuthenticationAuthorization.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {

  @Autowired
  private UserService _userService;

  @PostMapping("/register")
  public User register(@RequestBody UserPojo userPojo) {
    User registeredUser = _userService.registerUser(userPojo);
    String token = UUID.randomUUID().toString();
    String applicationUrl = "http://localhost:9001/verifyRegistration?token=" + token;
    _userService.createVerificationToken(registeredUser, token);
    System.out.println("Verification token created for user: " + registeredUser.getEmail());
    System.out.println("Verification url please click this url to verify your email " + applicationUrl);
    return registeredUser;
  }

  @PostMapping("/verifyRegistration")
  public String verifyRegistration(@RequestParam String token) {
    boolean isValid = _userService.validateToken(token);
    if (isValid) {
      _userService.enableUser(token);
      return "User enabled successfully";
    }
    return "Invalid token";
  }

  @GetMapping("/api/hello")
  public String hello(HttpServletRequest request) {
    return "Hello from auth";
  }

  @GetMapping("/hello")
  public String helloWithValidation() {
    return "Hello from auth";
  }

  @PostMapping("/signin")
  public String login(@RequestParam String email, @RequestParam String password) {
    return _userService.loginUser(email, password);
  }
}
