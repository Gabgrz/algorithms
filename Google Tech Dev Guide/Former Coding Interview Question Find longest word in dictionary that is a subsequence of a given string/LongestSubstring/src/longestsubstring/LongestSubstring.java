/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstring;



import java.util.Arrays;


/**
 *
 * @author gab12
 */
public class LongestSubstring {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Comparable c = null;
        String win = null;
        
        String S = "abppplee";
        String[] D = {"able","ale","apple","bale","kangaroo","ppleee"};
        System.out.println(Arrays.toString(D));
        Arrays.sort(D,new Comparable());
        System.out.println(Arrays.toString(D));
        
        LABEL: for(int i = 0; i < D.length; i++){ // Iteration over array of Strings D
            if(D[0].length() > S.length()) break;
            
            int count = 0;
            for(int x = 0; x < D[i].length();x++){ // Iteration over each String at D
                int y = 0;
                for(; y < S.length(); y++){ // Iteration over S to match characters
                    if(D[i].charAt(x) == S.charAt(y)){
                        count++;
                        break;
                    }
                }
                if(count == D[i].length()){win = D[i]; break LABEL;} 
            }
        }
        System.out.println("WIN!: "+win);
    }
}