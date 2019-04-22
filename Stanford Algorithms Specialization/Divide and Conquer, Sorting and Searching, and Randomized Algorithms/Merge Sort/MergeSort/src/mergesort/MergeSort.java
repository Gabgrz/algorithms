/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**a
 *
 * @author gab12
 */


class MergeSort {
  static int[] mergeSort(int inputArr[]){
	int[] outArr = new int[inputArr.length];
    if(inputArr.length == 1){
      outArr[0] = inputArr[0];
      return outArr;
    }
    int[] a = mergeSort(Arrays.copyOfRange(inputArr,0,inputArr.length/2));
    System.out.println("a: "+Arrays.toString(a));
    int[] b = mergeSort(Arrays.copyOfRange(inputArr,inputArr.length/2,inputArr.length));
    System.out.println("b: "+Arrays.toString(b));   
    int i = 0;
    int k = 0;
    for(int m = 0; m < outArr.length; m++){
      if(k == b.length){
        for(;i<a.length;i++){
          System.out.println("i: "+i);
          outArr[m++] = a[i];
          System.out.println("TEMP ARR: "+Arrays.toString(outArr));
          }
      }
      else if(i == a.length){
        for(;k<b.length;k++)
          outArr[m++] = b[k];
      }
      else{
        if(a[i] < b[k]){
          outArr[m] = a[i++];
        }
        else{
          outArr[m] = b[k++];
        }
      }
    }
    return outArr;
  }
  public static void main(String[] args) {
    System.out.println("Hello Codiva");
    
    int[] myArr = {7,10,8,5,11,12,6,1,0,25,21,56,2,100,13};
    System.out.println("FINAL OUTPUT: "+Arrays.toString(mergeSort(myArr)));
  }
}