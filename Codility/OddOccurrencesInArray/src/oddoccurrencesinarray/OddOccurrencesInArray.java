/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoccurrencesinarray;

/**
 *
 * @author gab12
 */
import java.util.Arrays;

public class OddOccurrencesInArray {

    int solution(int A[]) {

        // int[] A = {4,2,2,3,1,1};
        Arrays.sort(A);
        // length = 9;

        int i2 = 0;
        if (A[A.length - 2] != A[A.length - 1]) {
            return A[A.length - 1];
        }

        for (int i = 0, len = A.length - 1; i < len; i++) {

            System.out.println("i: " + i);
            if (A[i] == A[i + 1]) {
                i++;
                continue;
            } else {
                return A[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        OddOccurrencesInArray ooia = new OddOccurrencesInArray();
        int[] A = {4, 4, 2, 2, 3, 1, 1, 6, 3, 5, 5};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        System.out.print(ooia.solution(A));
    }
}

/*
Task: find unpaired integer
N = Odd number
Each element an Int from 1 to 1,000,000,000
All but one element can be paired
Recursive call?
1. sort Array
	if found, discard both elements and go to next element
    (reduce N) return a new Array? new N = N-2
    - I keep reducing until an element is not paired
    ...
    return first element to not have a pair
    ...
    Helper method
    Receive an Array of two
    	compare i0 == i1
        	true -> return false;
        else
        	return true;
    ...
    B[] = Arrays.copyOfRange(A, 0, A.length()/2);
    C[] = Arrays.copyOfRange(A, A.length()/2, A.length);
    
    solution(B);
    solution(C);
    
    i0 == i1 -> Paired, discard
    if i0 != i1 -> Not paired, return (which?)
    	i0 is inpaired. i1 is paired
 */