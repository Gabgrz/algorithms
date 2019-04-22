/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn2;

/**
 *
 * @author gab12
 */
import java.util.Arrays;

public class ADN2 {
      public int[] solution(String S, int[] P, int[] Q) {
        String [] arrayString = S.split("");
        System.out.println(Arrays.toString(arrayString));
        int [] newArray = new int[P.length];
        // write your code in Java SE 8
        
        outerloop: for(int i = 0; i < newArray.length; i++){
            for(int j = P[i]; j <= Q[i]; j++){
                System.out.println("Substring: "+S.substring(j,Q[i]+1));
              	int subArr;
              	if(Arrays.binarySearch(arrayString,P[i],Q[i]+1, "A") >= 0){
                  newArray[i] = 1;
                  continue outerloop;
                }
              	else if(Arrays.binarySearch(arrayString,j,Q[i]+1, "C") >= 0){
                  System.out.println("arrayString.copy");
                  newArray[i] = 2;
                  continue outerloop;
                }
              	else if(Arrays.binarySearch(arrayString,j,Q[i]+1, "G") >= 0){
                  newArray[i] = 3;
                  continue outerloop;
                }
              	else if(Arrays.binarySearch(arrayString,j,Q[i+1]+1, "T") >= 0){
                  newArray[i] = 4;
                  continue outerloop;
                }
                // CAGCCTACAGCCTA
            } // A, C, G and T
        }
        return newArray;
    }
  
  public static void main(String[] args) {
    
    System.out.println(Arrays.toString(new ADN2().solution("CAGCCTACAGCCTA",new int[]{2,5,0,0,12}, new int[]{4,5,6,13,12})));
  }
}