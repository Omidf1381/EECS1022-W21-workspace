package console_apps;
import java.util.Scanner;

import model.Circle;

/*
 * This is version one of a console application.
 * we will prompt the user of radius values of two circle.
 * The application will output the areas of the two input circles.
 * This version improves number 1 by calling a reusable utility.
 */
public class CircleApp2 {
	// main method: entry point of execution
	public static void main(String[]args) {
    //Starting the execution of the application.
	//System.in denotes the standard input (i.e.,keyboard).
		Scanner input = new Scanner(System.in);
		
		// Start the actual application code here.
		
		/*
		 * Calculate the first circle.
		 */
		
	
		// Step 1: Prompt the user for the radius of the 1st Circle.
		System.out.println("Enter the radius of first circle");
		// Declare a variable to store the user input.
		//Step 2: Read floating-point number from the user.
		double radius1 = input.nextDouble(); 
		//Step 3: Compute the area of the input circle accordingly.
		
		
		// Change: reuse formula calculation by calling utility method.
		double area1 = Circle.getArea(radius1);
		
		String area1s = String.format("%.2f", area1);
		// Step 4 : Output the result book to the user.
		System.out.println("Area of circle is: "+ area1s);
		
		
		/*
		 * Calculate the second circle.
		 */
		
		// Step 1: Prompt the user for the radius of the 2st Circle.
		System.out.println("Enter the radius of 2nd circle");
		// Declare a variable to store the user input.
		//Step 2: Read floating-point number from the user.
		double radius2 = input.nextDouble(); 
		//Step 3: Compute the area of the input circle accordingly.
		
		// Change: reuse formula calculation by calling utility method.
		double area2 = Circle.getArea(radius2);
		
		String area2s = String.format("%.2f", area2);
		// Step 4 : Output the result book to the user.
		System.out.println("Area of circle is: "+ area2s);
		
		
		// end of application code.
		
		
		
	}
}
