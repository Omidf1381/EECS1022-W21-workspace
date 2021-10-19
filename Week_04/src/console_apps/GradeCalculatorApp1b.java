package console_apps;

import java.util.Scanner;


/*
 * Calculate the weighted sum of 5 assignment, each may come with a different weight.
 * e.g. Assignment 1 (20%) has 50 marks and assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp1b {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);


 /* Stage number 1: prompt User for Inputs*/
 
	System.out.println("Enter your name:");
	String name = input.nextLine();
	/* Prompt for assignment 1*/
	System.out.println(name +  ", What's the weight of your Assignmnet 1?");
	int weight1 = input.nextInt();
	System.out.println(name +  ", What's the marks of your Assignmnet 1 (out of 100)?");
	int marks1 = input.nextInt();
	/* Prompt for assignment 2*/
	System.out.println(name +  ", What's the weight of your Assignmnet 2?");
	int weight2 = input.nextInt();
	System.out.println(name +  ", What's the marks of your Assignmnet 2 (out of 100)?");
	int marks2 = input.nextInt();
	/* Prompt for assignment 3*/
	System.out.println(name +  ", What's the weight of your Assignmnet 3?");
	int weight3 = input.nextInt();
	System.out.println(name +  ", What's the marks of your Assignmnet 3 (out of 100)?");
	int marks3 = input.nextInt();
	/* Prompt for assignment 4*/
	System.out.println(name +  ", What's the weight of your Assignmnet 4?");
	int weight4 = input.nextInt();
	System.out.println(name +  ", What's the marks of your Assignmnet 4 (out of 100)?");
	int marks4 = input.nextInt();
	/* Prompt for assignment 5*/
	System.out.println(name +  ", What's the weight of your Assignmnet 5?");
	int weight5 = input.nextInt();
	System.out.println(name +  ", What's the marks of your Assignmnet 5 (out of 100)?");
	int marks5 = input.nextInt();
	
	/* Stage 2: Do calculation */
	double weightedSum= 
			marks1 * (weight1 /100.0) +
			marks2 * (weight2 /100.0) +
			marks3 * (weight3 /100.0) + 
			marks4 * (weight4 /100.0) +
			marks5 * (weight5 /100.0);
	
	
	/* Stage3: output result */
	System.out.println("Assignment 1 [" + marks1 + ", " + weight1 + "%]");
	System.out.println("Assignment 2 [" + marks2 + ", " + weight2 + "%]");
	System.out.println("Assignment 3 [" + marks3 + ", " + weight3 + "%]");
	System.out.println("Assignment 4 [" + marks4 + ", " + weight4 + "%]");
	System.out.println("Assignment 5 [" + marks5 + ", " + weight5 + "%]");
	System.out.println("Weighted Sum: " + weightedSum);

	input.close();
	}

}
