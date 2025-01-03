package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.example.Learners.JavaLearner;
import org.example.Learners.Learner;
import org.example.Learners.NodeLearner;
import org.example.cohort.Cohort;
import org.example.course.Course;
import org.example.course.OfflineCourse;
import org.example.course.OnlineCourse;
import org.example.instructors.Instructor;


public class Main {
  public static void main(String[] args) throws IOException {

    Course javaOfflineCourse = new OfflineCourse("1", "Java Offline Course", "Java Offline Course Description", "Java", "Bangalore");
    Course nodeOfflineCourse = new OfflineCourse("1", "Node Offline Course", "Node Offline Course Description", "Node", "Mumbai");
    Course javaOnlineCourse = new OnlineCourse("1", "Java Online Course", "Java Online Course Description", "Java",
        "https://zoom.us/j/123456789");
    Course nodeOnlineCourse = new OnlineCourse("1", "Java Offline Course", "Java Offline Course Description", "Java",
        "https://zoom.us/j/1234557767");

    Cohort javaCohort = new Cohort("1", "Cohort 1", "Java Description", new Date(), new Date());
    javaOnlineCourse.addCohortToCourse(javaCohort);

    Cohort nodeCohort = new Cohort("1", "Cohort 1", "Node Cohort", new Date(), new Date());
    nodeOnlineCourse.addCohortToCourse(nodeCohort);

    Learner learner = new JavaLearner("1", "Learner 1", "Learner 1", "Java", true);
    Learner learner2 = new NodeLearner("2", "Learner 2", "Learner 2", "Java", true);

    javaCohort.addLearnerToCohort(learner);
    javaCohort.addLearnerToCohort(learner2);

    Instructor instructor = new Instructor("1", "Instructor 1", "Instructor 1", "Java");
    javaCohort.addInstructorToCohort(instructor);

    javaOnlineCourse.displayCourseDetails();

  }


}