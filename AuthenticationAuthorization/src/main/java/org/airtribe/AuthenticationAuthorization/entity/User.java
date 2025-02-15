package org.airtribe.AuthenticationAuthorization.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long userId;

  private String password;

  private String email;

  private String role;

  private boolean isEnabled;

  public User(long userId, String password, String email, String role, boolean isEnabled) {
    this.userId = userId;
    this.password = password;
    this.email = email;
    this.role = role;
    this.isEnabled = isEnabled;
  }

  public User() {

  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
  }
}
