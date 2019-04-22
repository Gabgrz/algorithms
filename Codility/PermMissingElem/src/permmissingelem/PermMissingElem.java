/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permmissingelem;

/**
 *
 * @author gab12
 */
import java.util.Arrays;

public class PermMissingElem {

    /*
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
     */
    public int solution(int[] A) {
        long n = A.length + 1;
        long sumAll = n * (n + 1) / 2;
        long sumMissing = 0;
        for (int i = 0; i < A.length; i++) {
            sumMissing += A[i];
        }
        return (int) (sumAll - sumMissing);
    }

    /*
  static public int solution(int[] A){
    Arrays.sort(A);
    if(A[0] != 1) return 1;
    for(int i = 0; i < A.length-1; i++){
      if(A[i]+1 != A[i+1]){return A[i]+1;}
    }
    return 0;
  }
     */
    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2, 3, 1, 5}));
    }
}