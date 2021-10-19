package console_apps;

import java.util.Scanner;

public class GradeCalculatorApp3 {


	public static void main(String[] args) {
Scanner input = new Scanner(System.in);


/* Stage 1: prompt user for Inputs*/
System.out.println("Enter your name:");
String name = input.nextLine();

	
	double weightedSum = 0.0;
	String report = "";
	
	int i = 1;
	boolean userwantsToContinue = true;
	while(userwantsToContinue) {
	/*
	 * known issue of Scanner:
	 * when a string(input.nextLine()) is expected to be read after an integer (input.nextLine()),
	 * we must consume the lines for every integer reading.
	 */
	System.out.println(name+ ", what's the wieght of your Assignement "+ i + "?");
	int weight = input.nextInt();
	input.nextLine(); //consume the new line character
	System.out.println(", what's the marks of your Assignment "+ i + " (out of 100)?");
	int marks = input.nextInt();
	input.nextLine();
	report += "Assignment "+ i + " [" + marks + ", "+ weight +"%]";
	// if(i<= 4) {// In this extended version, the number of assignments is indefinite.
	// }
	if(i<=4) {
		report += "\n";
	}
	weightedSum = weightedSum + marks * (weight/100.0);
	i ++;
	
		System.out.println("Would you like to continue? (Y for yes, otherwise no)?");
	String answer = input.nextLine();
	userwantsToContinue = answer.equals("Y");
	}
	System.out.println(report);
	System.out.println("Weighted Sum: "+ weightedSum);
	input.close();
	}
}
