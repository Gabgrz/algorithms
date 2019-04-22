/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecomplexity;

/**
 *
 * @author gab12
 */
public class TimeComplexity {

    /**
     * @param args the command line arguments
     */
    
    /* pseudo
    add first number with num
    add second number with num-1
    continue until there are no more pairs
    add all sums to result
    
    Divide and Conquer
    
    Method:
    Given n = 6
    
    boolean isEven = false;
    
    if(n % 2 == 0) isEven = true; else{isEven = false}
    
    numInicial = 1
    numFinal = n
    
    result += {
        1) = 1 + 6 -> numInicial + numFinal
        2) = 2 + 5 -> ++numInicial + --numFinal
        3) = 3 + 4 -> --numInicial + --numFinal
    }
    
    if numFinal - numInicial equals to 1, no more operations are possible. Stop method and return result.
    if numFinal - numInicial equals 2, do not perform an operation, just add numInicial only. Stop method and return result.
    
    Given n = 5
    1 + 5
    2 + 4
    3 + 
    
    */
    
    static int fastSolution(int num){
        int result = 0;
        boolean isEven = (num % 2 == 0) ? true : false; 
        for(int numInicial = 1, half = num/2; numInicial <= half; numInicial++){
            result += numInicial + num--;
            if(num - numInicial == 1) return result;
            else if (num - numInicial == 2){return (result += num);} else if(num - numInicial == 1 && isEven == false){}
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fastSolution(4));
    }
}