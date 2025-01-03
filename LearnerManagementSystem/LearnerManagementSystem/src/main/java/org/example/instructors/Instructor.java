package org.example.instructors;

public class Instructor {
  public String instructorId;
  public String instructorName;
  public String instructorEmail;
  public String instructorPhone;

  public Instructor(String instructorId, String instructorName, String instructorEmail, String instructorPhone) {
    this.instructorId = instructorId;
    this.instructorName = instructorName;
    this.instructorEmail = instructorEmail;
    this.instructorPhone = instructorPhone;
  }

  public String getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(String instructorId) {
    this.instructorId = instructorId;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getInstructorEmail() {
    return instructorEmail;
  }

  public void setInstructorEmail(String instructorEmail) {
    this.instructorEmail = instructorEmail;
  }

  public String getInstructorPhone() {
    return instructorPhone;
  }

  public void setInstructorPhone(String instructorPhone) {
    this.instructorPhone = instructorPhone;
  }

  public void displayInstructorDetails() {
    System.out.println("InstructorId " + instructorId);
    System.out.println("InstructorName " + instructorName);
    System.out.println("InstructorEmail " + instructorEmail);
    System.out.println("InstructorPhone " + instructorPhone);
  }
}
