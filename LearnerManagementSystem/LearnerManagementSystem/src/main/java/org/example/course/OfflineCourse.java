package org.example.course;

import java.util.List;
import org.example.instructors.Instructor;


public class OfflineCourse extends Course {
  public String location;

  public OfflineCourse(String courseId, String courseName, String courseDescription, String courseLanguage,
      String location) {
    super(courseId, courseName, courseDescription, courseLanguage);
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course ID: " + courseId);
    System.out.println("Course Name: " + courseName);
    System.out.println("Course Description: " + courseDescription);
    System.out.println("Course Language: " + courseLanguage);
    System.out.println("Location: " + location);
    for(int i=0;i< _cohortList.size();i++) {
      _cohortList.get(i).displayCohortDetails();

      List<Instructor> instructorList = _cohortList.get(i).getInstructorList();
      for(int j=0;j<instructorList.size();j++) {
        System.out.println("Instructor ID: " + instructorList.get(i).getInstructorId());
        System.out.println("Instructor Name: " + instructorList.get(i).getInstructorName());
        System.out.println("Instructor Email: " + instructorList.get(i).getInstructorEmail());
        System.out.println("Instructor Phone: " + instructorList.get(i).getInstructorPhone());
      }
    }
  }
}
