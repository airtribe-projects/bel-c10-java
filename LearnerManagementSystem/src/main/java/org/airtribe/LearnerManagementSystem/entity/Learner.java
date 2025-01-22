package org.airtribe.LearnerManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


@Entity
public class Learner {

  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
  public Long learnerId;

  @NotBlank
  @NotNull(message = "Name is mandatory")
  private String name;

  @Email
  @NotNull(message = "Email is mandatory")
  private String email;

  @Positive(message = "Phone number should be positive")
  @NotNull(message = "Phone number is mandatory")
  private String phone;
  private String address;

  public Learner() {

  }

  public Learner(Long learnerId, String name, String email, String phone, String address) {
    this.learnerId = learnerId;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
  }

  public Long getLearnerId() {
    return learnerId;
  }

  public void setLearnerId(Long learnerId) {
    this.learnerId = learnerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
