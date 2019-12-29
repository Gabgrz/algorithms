package com.company;

// Java code below
import java.math.*;

class Solution {


    static double closestToZero(double[] ts) {
        boolean isNeg = false;
        double closestToZero = ts[0];
        for(int i = 0; i < ts.length; i++){
            if(closestToZero == 0)
                return closestToZero;
            else if (Math.abs(ts[i]) <= Math.abs(closestToZero)) {
                closestToZero = Math.abs(ts[i]);
                if (ts[i] > 0)
                    isNeg = false;
                else
                    isNeg = true;
            }
        }
        if(isNeg)
            return closestToZero - closestToZero - closestToZero;
        else
            return closestToZero;
    }

    public static void main (String[] args){
        // Update this test case to check your solution works
// in all cases.
        double[] ts =
                {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,1.7,3.7,-6.2,7};

        double result = Solution.closestToZero(ts);

        System.out.println("Result: " + result);
    }

}