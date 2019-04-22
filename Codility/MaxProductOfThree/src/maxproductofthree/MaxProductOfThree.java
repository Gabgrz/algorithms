/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxproductofthree;

/**
 *
 * @author gab12
 */

import java.util.Arrays;

public class MaxProductOfThree {
    
    public int solution(int[] A) {
        // write your code in Java SE 8
        int product = Integer.MIN_VALUE;
        Arrays.sort(A);
        //    System.out.println(Arrays.toString(A));

        if (A[A.length - 1] > 0 && A[0] > 0) {
            return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        } else if (A[A.length - 1] < 0 && A[0] < 0) {
            return A[0] * A[1] * A[2];
        } else {
            product = (A[0] * A[1] > A[A.length - 2] * A[A.length - 3]) ? A[0] * A[1] * A[A.length - 1] : A[A.length - 1] * A[A.length - 2] * A[A.length - 3];

        }

        /*        
        
        int len = A.length;
        for(int i = 0; i < len-2; i++){
            product = (A[i]*A[i+1]*A[i+2] > product) ? A[i]*A[i+1]*A[i+2] : product;*/
        return product;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(new  MaxProductOfThree().solution(new int[]{1,2,3,4}));
    }
}