package org.airtribe.AuthenticationAuthorization.service;

import java.util.Collections;
import java.util.Date;
import org.airtribe.AuthenticationAuthorization.entity.User;
import org.airtribe.AuthenticationAuthorization.entity.VerificationToken;
import org.airtribe.AuthenticationAuthorization.model.UserPojo;
import org.airtribe.AuthenticationAuthorization.repository.UserRepository;
import org.airtribe.AuthenticationAuthorization.repository.VerificationTokenRepository;
import org.airtribe.AuthenticationAuthorization.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepository _userRepository;

  @Autowired
  private PasswordEncoder _passwordEncoder;

  @Autowired
  private VerificationTokenRepository _verificationTokenRepository;

  public User registerUser(UserPojo userPojo) {
    User databaseUser = new User();
    databaseUser.setEmail(userPojo.getEmail());
    databaseUser.setPassword(_passwordEncoder.encode(userPojo.getPassword()));
    databaseUser.setRole("USER");
    databaseUser.setEnabled(false);
    return _userRepository.save(databaseUser);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = _userRepository.findByEmail(username);
    if (user == null) {
      throw new UsernameNotFoundException("User not found");
    }
    return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
        Collections.emptyList());
  }

  public void createVerificationToken(User registeredUser, String token) {
    VerificationToken verificationToken = new VerificationToken();
    verificationToken.setToken(token);
    verificationToken.setUser(registeredUser);
    long expiryDate = (new Date().getTime() + 1000 * 60 * 60 * 24);
    verificationToken.setExpiryDate(new Date(expiryDate));
    _verificationTokenRepository.save(verificationToken);

  }

  public boolean validateToken(String token) {
    VerificationToken storedToken = _verificationTokenRepository.findByToken(token);
    if (storedToken == null) {
      return false;
    }

    long expiryTime = storedToken.getExpiryDate().getTime();
    if (expiryTime < System.currentTimeMillis()) {
      return false;
    }

    return true;
  }

  public void enableUser(String token) {
    VerificationToken storedToken = _verificationTokenRepository.findByToken(token);
    User storedUser = storedToken.getUser();
    storedUser.setEnabled(true);
    _userRepository.save(storedUser);
    _verificationTokenRepository.delete(storedToken);
  }

  public String loginUser(String email, String password) {
    User fetchedUser = _userRepository.findByEmail(email);

    if (fetchedUser == null || !fetchedUser.isEnabled()) {
      return "User not found or not enabled";
    }

    boolean isPasswordMatched = _passwordEncoder.matches(password, fetchedUser.getPassword());

    if (!isPasswordMatched) {
      return "Invalid Password";
    }

    return JwtUtil.generateToken(email);
  }
}
