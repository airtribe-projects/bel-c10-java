package org.example.cohort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.example.Learners.Learner;
import org.example.Learners.NodeLearner;
import org.example.instructors.Instructor;


public class Cohort {
  public String cohortId;
  public String cohortName;
  public String cohortDescription;

  public Date startDate;

  public Date endDate;

  public String courseId;

  List<Learner> _learnerList;

  public List<Instructor> _instructorList;

  public Cohort(String cohortId, String cohortName, String cohortDescription, Date startDate, Date endDate) {
    this.cohortId = cohortId;
    this.cohortName = cohortName;
    this.cohortDescription = cohortDescription;
    this.startDate = startDate;
    this.endDate = endDate;
    _learnerList = new ArrayList<>();
    _instructorList = new ArrayList<>();
  }

  public String getCohortId() {
    return cohortId;
  }

  public void setCohortId(String cohortId) {
    this.cohortId = cohortId;
  }

  public String getCohortName() {
    return cohortName;
  }

  public void setCohortName(String cohortName) {
    this.cohortName = cohortName;
  }

  public String getCohortDescription() {
    return cohortDescription;
  }

  public void setCohortDescription(String cohortDescription) {
    this.cohortDescription = cohortDescription;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public void addLearnerToCohort(Learner learner) {
    _learnerList.add(learner);
  }

  public void addInstructorToCohort(Instructor instructor) {
    _instructorList.add(instructor);
  }

  public void displayCohortDetails() {
    System.out.println("Cohort ID: " + cohortId);
    System.out.println("Cohort Name: " + cohortName);
    System.out.println("Cohort Description: " + cohortDescription);
    System.out.println("Start Date: " + startDate);
    System.out.println("End Date: " + endDate);
    for(int i=0;i< _learnerList.size();i++) {
      System.out.println("Learner ID: " + _learnerList.get(i).getLearnerId());
      System.out.println("Learner Name: " + _learnerList.get(i).getLearnerName());
      System.out.println("Learner Email: " + _learnerList.get(i).getLearnerEmail());
      System.out.println("Learner Phone: " + _learnerList.get(i).getLearnerPhone());
    }
    for(int i=0;i< _instructorList.size();i++) {
      System.out.println("Instructor ID: " + _instructorList.get(i).getInstructorId());
      System.out.println("Instructor Name: " + _instructorList.get(i).getInstructorName());
      System.out.println("Instructor Email: " + _instructorList.get(i).getInstructorEmail());
      System.out.println("Instructor Phone: " + _instructorList.get(i).getInstructorPhone());
    }
  }

  public String getCourseId() {

    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public List<Learner> getLearnerList() {
    return _learnerList;
  }

  public void setLearnerList(List<Learner> learnerList) {
    _learnerList = learnerList;
  }

  public List<Instructor> getInstructorList() {
    return _instructorList;
  }

  public void setInstructorList(List<Instructor> instructorList) {
    _instructorList = instructorList;
  }
}
