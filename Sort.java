/**
 * 
 */
package com.xatu.day4;

/**
 * @author Administrator
 *
 */
public class Sort {
    public static void cmpSort(int []a,IntCompare cmp) {
    	if(a!=null) {
    		for (int i = 1; i < a.length; i++) {
				int temp=a[i],j=i;
				if(cmp.cmp(a[j-1], temp)==1) {
					while(j>=1&&cmp.cmp(a[j-1], temp)==1) {
						a[j]=a[j-1];
						j--;
					}
				}
				a[j]=temp;
			}
    	}
    }
}
