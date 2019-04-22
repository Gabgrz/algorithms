/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapeequilibrium;

/**
 *
 * @author gab12
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        long total = 0;
        int minDiff = Integer.MAX_VALUE;
        long sumHalf1 = -1;
        long sumHalf2 = -1;
        int len = A.length;
        for (int i = 0; i < len; i++) {
            total += A[i];
        }

        long benchmark = (total / 2);
        System.out.println("benchmark: " + benchmark);
        int index1 = 0;
        int index2 = len - 1;
        long iterations = 0;
        int Pindex = 0;
        while (sumHalf1 < benchmark && sumHalf2 < benchmark) {
            sumHalf1 += A[index1++];
            sumHalf2 += A[index2--];
            iterations++;
        }
        System.out.println("iterations: " + iterations);
        if (sumHalf1 >= benchmark ? true : false) {
            // Pindex = iterations;1
            for (; iterations < len - (int) iterations; iterations++) {
                sumHalf2 += A[(int) iterations];
            }
        } else {
            Pindex = len - (int) iterations; // 3
            for (long i2 = iterations; i2 < Pindex; i2++) {
                sumHalf1 += A[(int) i2];
            }
        }
        System.out.println(sumHalf1 + " " + sumHalf2);
        minDiff = (int) Math.abs(sumHalf1 - sumHalf2);
        return minDiff;
    }

    public static void main(String[] args) {
        int A[] = {3, 1, 2, 4, 3};
        A = new int[]{3, 1};
        A = new int[]{-3, -1, -2, -4, -3};
        System.out.println("RESULT: " + new TapeEquilibrium().solution(A));
    }
}

/*
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
 */
