package org.example.Learners;

public class JavaLearner extends Learner {
  public boolean doesKnowObjectOrientedProgramming;

  public JavaLearner(String learnerId, String learnerName, String learnerEmail, String learnerPhone,
      boolean doesKnowObjectOrientedProgramming) {
    super(learnerId, learnerName, learnerEmail, learnerPhone);
    this.doesKnowObjectOrientedProgramming = doesKnowObjectOrientedProgramming;
  }

  @Override
  public void displayLearnerCredentials() {
    System.out.println("LearnerId " + learnerId);
    System.out.println("LearnerName " + learnerName);
    System.out.println("LearnerEmail " + learnerEmail);
    System.out.println("LearnerPhone " + learnerPhone);
    System.out.println("doesKnowObjectOrientedProgramming " + doesKnowObjectOrientedProgramming);
  }
}
