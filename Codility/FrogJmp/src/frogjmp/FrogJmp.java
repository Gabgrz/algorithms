/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogjmp;

/**
 *
 * @author gab12
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {

        int distance = Y - X;
        if (distance % D != 0) {
            return distance / D + 1;
        } else {
            return distance / D;
        }
    }

    public static void main(String[] args) {
        FrogJmp fj = new FrogJmp();
        System.out.println(fj.solution(10, 85, 30));
        System.out.println(fj.solution(10, 100, 10));
        System.out.println(fj.solution(0, 100, 10));
        System.out.println(fj.solution(0, 101, 10));
    }
}