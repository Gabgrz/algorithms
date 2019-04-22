/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missinginteger;

/**
 *
 * @author gab12
 */
import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);
        if (Arrays.binarySearch(A, 1) < 0) {
            return 1;
        } else {
            int positive = 1;
            int index = Arrays.binarySearch(A, 1);
            forloop:
            for (; index < A.length; index++) {
                if (index != A.length - 1) {
                    while (A[index + 1] == A[index]) {
                        continue forloop;
                    }
                }
                if (A[index] == positive++) {
                    continue;
                } else {
                    return --positive;
                }
            }
        }
        return A[A.length - 1] + 1;
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2, 1, 1, -1}));
        System.out.println(new MissingInteger().solution(new int[]{-1, 1, 1, 1, 2, 3, 4, 6}));
        System.out.println(new MissingInteger().solution(new int[]{1, 2, 3}));
        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}

// 1,2,3

/*
Task: find smallest positive integer that does not occur in Array A.
Given A = [1, 3, 6, 4, 1, 2], method should return 5
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

Pseudo
- Sort Array
- Try to find 1 in A
	If found, try to find 2 in A
    	... and so on
- If integer is not found, return it
 */
