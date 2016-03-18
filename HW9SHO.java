/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9sho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author sho
 */
public class HW9SHO {

   public static int[] numArray = {0,3,6,7,9,1,6,9}; 
  
  
    public static void main(String[] args) {
    
      System.out.println(getMean(numArray));
      System.out.println(getMedian(numArray));
      System.out.println(getMode(numArray)) ;
     }
       
    public static double getMean(int[] array){ 
        
    double result =0;     
    for(int i = 0; i < array.length;i++){
      result = result + array[i];    
   } 
    return result/numArray.length;
    }
    
    
    public static double getMedian(int[] array){
        
     if((array.length %2) !=0){ 
       
         Arrays.sort(array);
         System.out.print(Arrays.toString(array));
         System.out.println();
            return array[((array.length+1)/2)];

         
     }  
 
     else { 
         
         Arrays.sort(array);
          System.out.print(Arrays.toString(array));
          System.out.println();
       double n1 = array[(array.length/2)-1];
      double n2 = array[(array.length/2)];
      double r1 = (n1+n2)/2;
      return r1;
         
     }
    
    }
    
    
    public static int getMode(int[] array){ 
        
       int max = 0;
       int tmp = 0;

    for (int i = 0; i < array.length; ++i) {
        int count = 0;
        for (int j = 0; j < array.length; ++j) {
            if (array[j] == array[i]){
                ++count;
            }
        }
        if (count > max) {
            max = count;
           tmp = array[i];
        }
    }

    return tmp;

        
    }
    
    
}