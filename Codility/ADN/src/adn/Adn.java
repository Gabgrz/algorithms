/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;
/**
 *
 * @author gab12
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Adn {
        public int[] solution(String S, int[] P, int[] Q) {
            int[] newArr = new int[P.length];
            for (int i = 0; i < newArr.length; i++){
                String sub = S.substring(P[i], Q[i]+1);
                if(sub.contains("A")){
                    newArr[i] = 1;
                }
                else if(sub.contains("C")){
                    newArr[i] = 2;
                }
                else if(sub.contains("G")){
                    newArr[i] = 3;
                }
                else if(sub.contains("T")){
                    newArr[i] = 4;
                }
            }
            return newArr;
    }
       
    /* Alternative
            public int[] solution(String S, int[] P, int[] Q) {
            int[] newArr = new int[P.length];
            for (int i = 0; i < newArr.length; i++){
                String sub = S.substring(P[i], Q[i]+1);
                String[] strArray = sub.split("");
                for(int j = 0; j < strArray.length; j++){
                    if(strArray[j].equals("A")){
                      newArr[i] = 1;  
                      break;
                    } 
                    else if(strArray[j].equals("C")){
                      newArr[i] = 2; 
                      continue;
                    } 
                     else if(strArray[j].equals("G")){
                      newArr[i] = 3;  
                      continue;
                    } 
                    else if(strArray[j].equals("T")){
                      newArr[i] = 4;  
                      continue;
                    }
                }
            }
            return newArr;
    }
        
        */
        
        
        
        
        
        /*
        
        100% SCORE
        
        
            public int[] solution(String S, int[] P, int[] Q)
    {
        int N = S.length();
        int[][] count = new int[N + 1][4];
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                count[i + 1][j] = count[i][j];
            }
            
            switch (S.charAt(i))
            {
                case 'A':
                    count[i + 1][0]++;
                    break;
                
                case 'C':
                    count[i + 1][1]++;
                    break;
                    
                case 'G':
                    count[i + 1][2]++;
                    break;
                
                case 'T':
                    count[i + 1][3]++;
                    break;
            }
        }
        
        int M = P.length;
        int[] results = new int[M];
        
        for (int i = 0; i < M; i++)
        {
            int i0 = P[i];
            int i1 = Q[i];
            
            for (int j = 0; j < 4; j++)
            {
                if (count[i1 + 1][j] - count[i0 + 0][j] > 0)
                {
                    results[i] = j + 1;
                    break;
                }
            }
        }
        
        return results;
    }
        */
        
    public static void main(String[] args) {
        new Adn().solution("ACD", new int[]{1}, new int[]{1,2});
    }
}