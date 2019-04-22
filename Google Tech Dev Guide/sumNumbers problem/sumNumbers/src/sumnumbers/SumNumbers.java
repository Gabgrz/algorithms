/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumbers;

/**
 *
 * @author gab12
 */

/* Pseudocode: 

Variables:
- String that contains digits
- Int that contains the sum.

Methods: 
Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.

1. Run a FOR that iterates through all characters.
2. When a DIGIT is found, add it to the STRING variable.
3. Check if next char is another DIGIT.
- If next char is a DIGIT, add it to the STRING variable.
- If next char is not a digit:
		convert string to int.
    Add int to the sum variable.
    Continue with iteration.

*/

public class SumNumbers {
    
    // @param str the string to find numbers from and add
    
    static int sumNumbers(String str) {
        
        
        int sum = 0;
        
        for(int i = 0, len = str.length(); i < len; i++){
            String strNumbers = "";
            if(Character.isDigit(str.charAt(i))){
                System.out.println(i);
                int x = 1;
                strNumbers += str.charAt(i);
                    while(i+x < str.length() && Character.isDigit(str.charAt(i+x))){
                        strNumbers += str.charAt(i+x);
                        x++;
                    }
                    System.out.println("String of numbers is: "+strNumbers);
                    i = i+x;
                    sum += Integer.parseInt(strNumbers);
                
            }
            else{
            }
        }
        
        return sum;
        
    }

    /**
     
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma = sumNumbers("7 11");
        System.out.println(suma);
        
    }
        
}