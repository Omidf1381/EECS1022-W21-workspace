package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {

	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int result [] = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	
		 int size = numbers.length,
		 x=0,
		 count=0; 
		 for(int i=0; i<size; i++) 
		 if (numbers[i]%3==0) 
			  count++; 
		 
		  result=new int[count];
		 for(int i=0; i<size;i++) 
		  if (numbers[i]%3==0)
		  { 
		result[x] = numbers[i]; x++;
		  }
		 	  
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int count=0;
		for(int i=0;i<numbers.length; i++)
		{
		if(numbers[i]==n)
		count++;
		}
		
		result=new int[numbers.length-count];
		 int x=0; 
		 for(int i=0;i<numbers.length;i++)
		{
		 if(numbers[i]!=n)
		{
		result[x]=numbers[i];
		x++;
		  }
		}
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

	    result =new String[numbers.length];

		   for (int i = 0; i < numbers.length; i++) {
		    String word = "[";
	       for (int x = 0; x <= i; x++) {
		          word += numbers[x];
		          if (x != i) word += ", ";
		       }
		      word += "]";
	        result[i]= word;


	    }
		 
		/* Your implementation ends here. */
		
		    return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int [] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
	 int size = numbers.length;
	     result = new int[size];

         int i=0;
	       int x=0;
	       while(i < size) {
	           if (numbers[i] % 3 == 0) {
	            result[x] = numbers[i];
               x++;
	           }
	           i++;
	         }
	         i=0;
	       while(i < size) {
	           if (numbers[i]%3 == 1) {
	               result[x] = numbers[i];	
	               x++;
            }
		         i++;
	      }
	       i=0;
	       while(i < size) {
	           if (numbers[i] % 3 == 2) {
	               result[x] = numbers[i];
	               x++;
	           }
	           i++;
	       }
	
		/* Your implementation ends here. */
		
		return result;
	}
	
}
