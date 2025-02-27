package org.airtribe.AuthenticationAuthorization.model;

public class UserPojo {

  private String password;

  private String email;

  public UserPojo(String password, String email) {
    this.password = password;
    this.email = email;
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
}
