package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double taxAmount=0.0;
		   if(status==1)
		   {
		       if(income>=0 && income<=8350)
		       {
  taxAmount=0.10*income;
  
  result=String.format("Single Filing: $%.2f (Part I: $%.2f)",taxAmount,0.10*income);
		       }
 else if(income>=8351 && income<=33950)
		       {
		           taxAmount=(0.10*8350)+(0.15*(income-8350));
result=String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)",taxAmount,(0.10*8350),(0.15*(income-8350)));
		       }
  else if(income>33950)
		       {
	 taxAmount=(0.10*8350)+(0.15*25600)+(0.25*(income-33950));
	 result=String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)",taxAmount,(0.10*8350),(0.15*25600),(0.25*(income-33950)));
  }
 }
	else if(status==2)
 {
	 if(income>=0 && income<=16700)
{
  taxAmount=0.10*income;
  
  result=String.format("Married Filing: $%.2f (Part I: $%.2f)",taxAmount,0.10*income);
 }
 else if(income>=16701 && income<=67900)
 {
   taxAmount=(0.10*16700)+(0.15*(income-16700));
	  result=String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)",taxAmount,(0.10*16700),(0.15*(income-16700)));
		       }
		       else if(income>67900)
		       {
 taxAmount=(0.10*16700)+(0.15*51200)+(0.25*(income-67000)-225);
     result=String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)",taxAmount,(0.10*16700),(0.15*51200),(0.25*(income-67000)-225));
		       }   
		   }
		// for 3 and -1
	else if(status==3) {
		
		result=String.format("Illegal Status: 3");
	}
	 if(status==-1) {
		result=String.format("Illegal Status: -1");
	}
		
		
		
		
		
		
			

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		 	int p1wins = 0;
		 	int p2wins = 0;
			int r1 = 0;
			int r2 = 0;
			
	       if(p1r1 == 'R' && p2r1 == 'P' || p1r1 == 'P' && p2r1 == 'S' || p1r1 == 'S' && p2r1 == 'R' ) {
	        p2wins++;
	        r1 = 2;
	       }
	       else if(p1r1 == 'P' && p2r1 == 'R' || p1r1 == 'S' && p2r1 == 'P' || p1r1 == 'R' && p2r1 == 'S' ) {
	        p1wins++;
	        r1 = 1;
	       }
	       if(p1r2 == 'R' && p2r2 == 'P' || p1r2 == 'P' && p2r2 == 'S' || p1r2 == 'S' && p2r2 == 'R' ) {
	        p2wins++;
	        r2 = 2;
	       }
	       else if(p1r2 == 'P' && p2r2 == 'R' || p1r2 == 'S' && p2r2 == 'P' || p1r2 == 'R' && p2r2 == 'S' ) {
	        p1wins++;
	        r2 = 1;
	       }
	       String winner = "";
	       if(p1wins == p2wins) {
	         winner = "Tie! ";
	       } else if(p1wins > p2wins) {

	        winner = p1 + " wins! ";
	       } 
	       else{
	        winner = p2 + " wins! ";
	       }
	       String r1String = "";
	       if(r1 == 0) {
	         r1String =  "Tie " + "(" + p1r1 + " vs. " + p1r1 + ")";
	        } 
	       else if(r1 == 1) {

	          r1String =  p1 + " wins " + "(" + p1r1 + " vs. " + p2r1 + ")";
	        }
	       else {
	          r1String =  p2 + " wins " + "(" + p2r1 + " vs. " + p1r1 + ")";
	        }
	       String r2String = "";
	       if(r2 == 0) {

	         r2String =  "Tie " + "(" + p1r2 + " vs. " + p1r2 + ")";

	        } else if(r2 == 1) {

	          r2String =  p1 + " wins " + "(" + p1r2 + " vs. " + p2r2 + ")";
	          
	        } else {
	        	
	          r2String =  p2 + " wins " + "(" + p2r2 + " vs. " + p1r2 + ")";
	        }
	        result = "Game over: " + winner + "[Round 1: " + r1String + " ; Round 2: " + r2String + "]";
	
		/* Your implementation ends here. */

		return result;
	}
}
