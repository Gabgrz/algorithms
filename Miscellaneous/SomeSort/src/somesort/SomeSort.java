/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somesort;

/**
 *
 * @author gab12
 */

import java.util.Arrays;

public class SomeSort {
  
  int[] sort(int[] a) {
  int[] newArr;
  int curr = 0;
  
  for(int i = 1; i < a.length; i++){
    int count = 0;
    if(a[curr] < a[i]){
      curr++;
      continue;} 
    else if(a[curr] > a[i]){
      
      int temp = a[i];
      a[i] = a[curr];
      a[curr] = temp;
    }
    
  }
    return a;
}
  public static void main(String[] args) {
    SomeSort sc = new SomeSort();
    sc.sort(new int[]{3,1,2,5,6,2});
    System.out.println(Arrays.toString(sc.sort(new int[]{3,1,2,5,6,2})));
  }
}