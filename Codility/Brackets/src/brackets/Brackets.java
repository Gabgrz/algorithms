/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brackets;

/**
 *
 * @author gab12
 */
import java.util.Stack;
public class Brackets {

    public int solution(String S) {
        Stack<Character> leftBrackets = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                if (leftBrackets.empty()) {
                    return 0;
                }
                char top = leftBrackets.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{')) {
                    return 0;
                }
            } else {
                leftBrackets.push(ch);
            }
        }
        return leftBrackets.empty() ? 1 : 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Brackets().solution("([)()]"));
    }
}