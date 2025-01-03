package org.example.course;

import java.util.ArrayList;
import java.util.List;
import org.example.cohort.Cohort;


// First design -> Assuming there are no data associated with offline, online, node and java courses
public abstract class Course {
  protected String courseId;

  protected String courseName;

  public String courseDescription;

  public String courseLanguage; // Node, java

  public List<Cohort> _cohortList;

  public Course(String courseId, String courseName, String courseDescription, String courseLanguage) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseDescription = courseDescription;
    this.courseLanguage = courseLanguage;
    this._cohortList = new ArrayList<>();
  }

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

  public String getCourseLanguage() {
    return courseLanguage;
  }

  public void setCourseLanguage(String courseLanguage) {
    this.courseLanguage = courseLanguage;
  }


  public abstract void displayCourseDetails();

  public List<Cohort> getCohortList() {
    return _cohortList;
  }

  public void addCohortToCourse(Cohort cohort) {
    _cohortList.add(cohort);
  }
}
