/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecomplexity2;

/**
 *
 * @author gab12
 */
public class TimeComplexity2 {
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