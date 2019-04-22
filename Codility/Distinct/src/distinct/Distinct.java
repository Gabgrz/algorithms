/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinct;

/**
 *
 * @author gab12
 */
import java.util.Arrays;
public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int distinct = A.length > 0 ? 1 : 0;
       
        for (int i = 0; i < A.length-1; i++){
            if (A[i] == A[i+1]) continue;
            else{distinct++;}
        }
        return distinct;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}