/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxcounters;

/**
 *
 * @author gab12
 */
import java.util.Arrays;
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int maxCounter = 0;
        int lastUpdateCounter = 0;
        int counters[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            int X = A[i];
            if (X >= 1 && X <= N) {
                X--;
                if (counters[X] > lastUpdateCounter) {
                    counters[X] = counters[X] + 1;
                } else {
                    counters[X] = lastUpdateCounter + 1;
                }
                if (counters[X] > maxCounter) {
                    maxCounter = counters[X];
                } else {
                }
            } else if (X == N + 1) {
                lastUpdateCounter = maxCounter;
            }
        }
        for (int j = 0; j < counters.length; j++) {
            if (counters[j] < lastUpdateCounter) {
                counters[j] = lastUpdateCounter;
            }
        }

        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }
}
/*
TASK:
Calculate the value of all counter after all operations

DATA
Array A 
- non empty
- of M integers, could be duplicates

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X)
if A[K] = N + 1 then operation K is max counter.

FACTS
- There are N counters initially set to zero
- N and M are integers within the range [1..100,000];
- each element of array A is an integer within the range [1..N + 1].

POSSIBLE OPERATIONS
increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.

VARIABLES
N = number of counters
A = ARRAY OF M Integers
X = Number of counter
maxCounter
-------------------------

Data set sample:
N = 5
A = {3,4,4,6,1,4,4}

0 0 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 2 0

2 2 2 2 2 -increment all to maxValue

3 2 2 2 2 - x+max_value+1 -> max_value = 3
3 2 2 3 2 - x+lastMaxValue+1
3 2 2 4 2 - 

When X = N+1 
	update maxValue
 */