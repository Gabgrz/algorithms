/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genomicrangequeryfinal;

/**
 *
 * @author gab12
 */
public class GenomicRangeQueryFinal {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] newArr = new int[P.length];
        for (int i = 0; i < newArr.length; i++) {
            String sub = S.substring(P[i], Q[i] + 1);
            if (sub.contains("A")) {
                newArr[i] = 1;
            } else if (sub.contains("C")) {
                newArr[i] = 2;
            } else if (sub.contains("G")) {
                newArr[i] = 3;
            } else if (sub.contains("T")) {
                newArr[i] = 4;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {

        System.out.println("Hello Codiva");

    }
}