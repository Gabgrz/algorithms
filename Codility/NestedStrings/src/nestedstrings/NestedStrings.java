/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedstrings;

/**
 *
 * @author gab12
 */

import java.util.Stack;

public class NestedStrings {
    
        public int solution(String S) {
            // write your code in Java SE 8

            Stack<Character> stack = new Stack<>();
            // .out.println("ORIGINAL STACK: "+stack);

            outerloop: for(int i = 0; i < S.length(); i++){
                char c = S.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    stack.push(S.charAt(i));
                    // .out.println("STACK: "+stack);
                }
                else {
                    System.out.println("ELSE CHAR: "+c);
                    switch(c){
                        case ')': 
                            if (stack.lastElement() == '('){
                                System.out.println("LAST CHAR: "+stack.lastElement());
                                stack.pop();
                                continue;
                            }
                            else return 0;
                        case '}': 
                            if (stack.lastElement() == '{') {
                                System.out.println("LAST CHAR: "+stack.lastElement());
                                stack.pop();
                                continue;
                            }
                            else return 0;
                        case ']': 
                            if (stack.lastElement() == '[') {
                                System.out.println("LAST CHAR: "+stack.lastElement());
                                stack.pop();
                                continue;
                            }
                            else return 0;
                    }
                }
            }

            //  "(", "{", "[", "]", "}" and/or ")".


            return 1;

        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // {[()()]}
        System.out.println(new NestedStrings().solution("{[()()]}"));
    }
}