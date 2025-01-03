package org.example.course;

public class OnlineCourse extends Course {

  public String zoomUrl;


  public OnlineCourse(String courseId, String courseName, String courseDescription, String courseLanguage,
      String zoomUrl) {
    super(courseId, courseName, courseDescription, courseLanguage);
    this.zoomUrl = zoomUrl;
  }

  public String getZoomUrl() {
    return zoomUrl;
  }

  public void setZoomUrl(String zoomUrl) {
    this.zoomUrl = zoomUrl;
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course ID: " + courseId);
    System.out.println("Course Name: " + courseName);
    System.out.println("Course Description: " + courseDescription);
    System.out.println("Course Language: " + courseLanguage);
    System.out.println("Zoom URL: " + zoomUrl);
    for(int i=0;i< _cohortList.size();i++) {
      _cohortList.get(i).displayCohortDetails();
    }
  }
}
