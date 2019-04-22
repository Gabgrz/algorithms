/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

/**
 *
 * @author gab12
 */
import java.util.Arrays;

public class Permutation {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if (A[0] == 1) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] + 1 != A[i + 1]) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Codiva");
    }
}