package model;

import java.util.Arrays;

public class Utilities {
   /**
   * method to get all prefixes given integer array of numbers
   * @param numbers
   * @return
   */
   public static String[] getAllPrefixes(int[] numbers) {
   String[] result = null;
   result = new String[numbers.length];//create a new String array of same length as numbers
   //run for loop from 0 to (length of numbers array times)
   for(int i = 0; i < numbers.length; i++) {
       int count = (i+1);//get count
       String data[] = new String[count];//create a String data array of length = count
       for(int j = 0; j < data.length; j++) {//run for loop from 0 to (length of data array) times
           data[j] = String.valueOf(numbers[j]);//populate data array
       }//end of inner for loop
       result[i] = Arrays.toString(data);//convert data to String and add it to ith index of result
   }
   return result;//return result
   }


}