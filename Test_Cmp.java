/**
 * 
 */
package com.xatu.day4;

/**
 * @author Administrator
 *
 */
public class Test_Cmp {
      public static void main(String[] args) {
		  //��������
    	  int []arr1= {7,3,19,40,4,7,1};
    	  Sort.cmpSort(arr1, new cmpUp());
    	  System.out.println("��������:");
    	  for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		  }
    	  System.out.println();
    	  //��������
    	  int []arr2= {7,3,19,40,4,7,1};
    	  Sort.cmpSort(arr2, new cmpDown());
    	  System.out.println("��������:");
    	  for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	  }
}
