/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingcars;

/**
 *
 * @author gab12
 */
public class PassingCars {

    public int solution(int[] A) {
        int countZero = 0;
        int pairs = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                countZero++;
                continue;
            } else {
                pairs += countZero;
                if (pairs > 1000000000) {
                    return -1;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
    }
}
