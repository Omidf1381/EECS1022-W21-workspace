package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		int a = lower;
		int b = upper;
		int c;
		c = (a + 1 - b);
		
		 if (a < 0 || b < 0 ) {
		        result = "Error: both bounds must be non-negative";
		 }
		 else if (a>b) {
			        result = ("Error: lower bound " + a + " is not less than or equal to upper bound " + b);
		 }
		    else
		    {
		        for (int num = a; num <= b; num++) {
		        	
		            if (num % 3 == 0) result += "(" + num + ")";
		            
		            else if (num % 3 == 1) result += "[" + num + "]";
		            
		            else result += "{" + num + "}";
		            
		            if(num!=b)result+=", ";
		        }
		        if (a == b) {
		            result = "1 number between " + a + " and " + b + ": <" + result.trim() + ">";
		        } else {
		            result = (1 + b - a) + " numbers between " + a + " and " + b + ": <" + result.trim() + ">";
		        }
		    }
		 
		 
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		 //a= stringSequence
		// b= arithmeticSequence 	
		String a = "";
		String b = "";
		int sum = 0;
		double average = 0.0;
		
		if(n>1) {	
		 for(int i = 0; i< n-1; i++) {
				
		b += (ft + i * d);
		sum += ((i*d) + ft );
		
		average = ((double)sum/(i+1));
		
		String avg = String.format("%.2f", average);
		
	a += "[sum of <" + b + ">: " + sum + " ; avg of <" + b + ">: "+ avg + "], "; b += ", ";
			}
		}
		if(n!=0) {
			
		b += (ft + ((n-1) * d));
		sum += ft +((n-1)*d);
		
		average = (double)sum/n;
		String avg = String.format("%.2f", average);
		
		a += "[sum of <" + b + ">: " + sum + " ; avg of <" + b + ">: " + avg + "]";
		}
		
	result += "{" + a + "}";
		
		
	

		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		   int first = 0;
	       int second = 0;
	       int a = ft1;
	       int b = ft2;
	        result += "<";
	        
	        while (first < n1 && second < n2) 
	        {
	            a = ft1 + first*d1;
	            b = ft2 + second*d2;
	            
	            result += "(" + Integer.toString(a) + ")";
	            result += ", ";
	            result += "[" + Integer.toString(b) + "]";
	            if (first != n1-1 || second != n2-1)
	            	
	                result += ", ";
	            first++;
	            second++; 
	            }
	        while (first < n1) 
	        {
	            a = ft1 + first*d1;
	            result += "(" + Integer.toString(a) + ")";   
	            if (first != n1-1)
	              result += ", ";
	            first++;
	            }
	        	while (second < n2)
	        	{
	            b = ft2 + second*d2;
	            result += "[" + Integer.toString(b) + "]";
	            if (second != n2-1)
	                result += ", ";
	            second++; }
	        result += ">";
		
		/* Your implementation ends here. */
		return result;
	}	
}
