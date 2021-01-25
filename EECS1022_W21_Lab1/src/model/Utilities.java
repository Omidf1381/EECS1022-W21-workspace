package model;

import java.util.Scanner;

public class Utilities {
	
	/*
	 * Assumption: the return geometric sequence is of a fixed size 5. 
	 * Therefore, it is not necessary to solve this problem using a loop,
	 * or to use methods from a library class (e.g., Math).\
	 * 
	 * Input parameters:
	 * 	- `ft` is the first term in the sequence
	 *  - `ratio` is the common rations among terms in the sequence
	 *  
	 * Refer to you lab instructions for what the method should return.
	 */
	
	
	
	
	
	public static String getGeometricSequence(int ft, int ratio) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int a1 = ft;
		int a2 = ft * ratio;
		int a3 = ft * ratio * ratio;
		int a4 = ft * ratio * ratio * ratio;
		int a5 = ft * ratio * ratio * ratio * ratio;
		
	
				
		 result = "[" + a1  + "]" + "["+ a2 + "]"+"[" + a3  + "]"+"["+ a4  +"]" + "[" +a5 +"]" + " has average " + (a1+a2+a3+a4+a5)/5.0;
		 int average = a1 + a2 + a3 + a4 + a5;
		
			

			 
			
			 
			 
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 *   - `weight` is the user's weight in pounds
	 *   - `height` is the user's height in inches
	 *   
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	
		
		
		
		result = weight * 0.4536 / (height * 0.0254 * height * 0.0254);
		
		// k/(m*m)
		

		
		
		
		
		
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Assumption: input value `seconds` is non-negative (i.e., >= 0).
	 * 
	 * Input parameters:
	 *   - `seconds` is the number of seconds to be converted
	 *   
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getTimeConversion(int seconds) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		
		
		int days = seconds / 86400;
		int hours = (seconds % 86400) / 3600; 
		int minutes = ((seconds % 86400) % 3600)/60;
		int sec = ((seconds % 86400) % 3600 % 60);
		
		
		
		result = days + " days " + hours + " hours " + minutes + " minutes "+ sec + " seconds";
		
		// 3 
		
		
	
		
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
}
