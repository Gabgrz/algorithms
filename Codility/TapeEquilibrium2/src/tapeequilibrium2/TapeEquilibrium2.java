/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapeequilibrium2;

/**
 *
 * @author gab12
 */
public class TapeEquilibrium2 {

    public static void main(String[] args) {
        System.out.println("FINAL RESULT: " + new TapeEquilibrium2().solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println("FINAL RESULT: " + new TapeEquilibrium2().solution(new int[]{3, 1}));
        System.out.println("FINAL RESULT: " + new TapeEquilibrium2().solution(new int[]{-3, -1, -2, -4, -3}));
        System.out.println("FINAL RESULT: " + new TapeEquilibrium2().solution(new int[]{-3, -1, -2, 4, 3}));
        System.out.println("FINAL RESULT: " + new TapeEquilibrium2().solution(new int[]{-3, -1, -2, 4, 100}));
    }

    public int solution(int[] A) {
        int total = 0;
        int diff = Integer.MAX_VALUE;
        int half1 = 0;
        int half2 = total;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        for (int i = 1; i < A.length; i++) {
            half1 += A[i - 1];
            half2 = total - half1;
            diff = Math.min(diff, Math.abs(half1 - half2));
        }
        return diff;
    }
}
