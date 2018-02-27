/**
 * 
 */
package com.xatu.day3;

/**
 * @author Administrator
 *
 */
public class ArraySum {
    public int arraySum(int[] arr) {
    	int sum=0;
    	for(int i:arr) {
    		sum=sum+i;
    	}
    	return sum;
    }
}
