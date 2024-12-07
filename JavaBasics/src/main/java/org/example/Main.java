package org.example;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    String[] names = new String[100];
    int[] ages = new int[100];
    int[] xps = new int[100];
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    int totalCount = 0;

    do {
      System.out.println("Learner Management System");
      System.out.println("1. Add New Learner");
      System.out.println("2. Display All Learners");
      System.out.println("3. Calculate Average XP");
      System.out.println("4. Exit");

      System.out.println("Enter your choice");
      choice = sc.nextInt();

      if (choice == 1) {
        if (totalCount < names.length) {
          System.out.println("Enter learners name");
          String name = sc.next();
          names[totalCount] = name;
          System.out.println("Enter learners age");
          int age = sc.nextInt();
          ages[totalCount] = age;
          System.out.println("Enter learners xp");
          int xp = sc.nextInt();
          xps[totalCount] = xp;
          totalCount++;
        } else {
          System.out.println("Maximum learners reached. Cannot add more.");
        }
      } else if (choice == 2) {
          if (totalCount == 0) {
            System.out.println("There are no learners to display");
          } else {
            System.out.println("All learners:");
            for (int i = 0; i < totalCount; i++) {
              System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", XP: " + xps[i]);
            }
          }
      } else if (choice == 3) {
        if (totalCount == 0) {
          System.out.println("No learners to calculate the XPS");
        } else {
          int totalXP = 0;
          for (int i = 0; i < totalCount; i++) {
            totalXP += xps[i];
          }
          double averageXP = (double) totalXP / totalCount;
          System.out.println("Average XP: " + averageXP);
        }
      } else if (choice == 4) {
          System.out.println("Exiting the program");
      }

    } while(choice != 4);

  }
}