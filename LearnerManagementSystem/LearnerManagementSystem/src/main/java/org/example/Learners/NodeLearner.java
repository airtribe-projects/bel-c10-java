package org.example.Learners;

public class NodeLearner extends Learner {
  public boolean doesKnowJavaScript;

  public NodeLearner(String learnerId, String learnerName, String learnerEmail, String learnerPhone,
      boolean doesKnowJavaScript) {
    super(learnerId, learnerName, learnerEmail, learnerPhone);
    this.doesKnowJavaScript = doesKnowJavaScript;
  }

  @Override
  public void displayLearnerCredentials() {
    System.out.println("LearnerId " + learnerId);
    System.out.println("LearnerName " + learnerName);
    System.out.println("LearnerEmail " + learnerEmail);
    System.out.println("LearnerPhone " + learnerPhone);
    System.out.println("DoesKnowJavaScript " + doesKnowJavaScript);
  }
}
