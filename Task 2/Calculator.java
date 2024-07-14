package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int no_Subjects = sc.nextInt();

        int[] marks = new int[no_Subjects];
        int totalMarks = 0;

        for (int i=0; i< no_Subjects;i++){
            System.out.println("Enter the marks for subject" +(i+1) + " (out of 100): ");
            marks[i] =sc.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = totalMarks / no_Subjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks is: " + totalMarks);
        System.out.println("Average Percentage is: " + averagePercentage + "%");
        System.out.println("Grade is: " + grade);

    }
}