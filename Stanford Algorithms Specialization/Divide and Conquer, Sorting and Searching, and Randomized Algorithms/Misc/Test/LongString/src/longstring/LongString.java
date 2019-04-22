/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longstring;

/**
 *
 * @author gab12
 */
public class LongString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Long l1 = 314159265L;
        Long l2 = 35897L;
        Long l3 = l1+l2;
        System.out.println(l3);
        System.out.println((long)l1+l2);
        
        double dd = 3141592653589793238462643383279502884197169399375105820974944592D;
        // System.out.println(Math.sqrt(s1));
        String x2 = "135";
        
    }
    
}

/* Task:
Add two big ass numbers and print the result:
3141592653589793238462643383279502884197169399375105820974944592
2718281828459045235360287471352662497757247093699959574966967627
*/

