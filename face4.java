package com.xatu.day2;
/**
 * @author Administrator
 *
 */
public class face4 {
    public static void main(String[] args) {
    	int array[]= {1,2,2,3,4,2,5};
    	int moreThanHalfNum_Solution = MoreThanHalfNum_Solution(array);
	    System.out.println(moreThanHalfNum_Solution);
    }

	/**
	 * @param array
	 * 寻找数字出现次数最多的数字
	 */
	private static int MoreThanHalfNum_Solution(int[] array) {
   		// TODO Auto-generated method stub
		int max=0;
		int count=0;
		int a[]=new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i]-array[j]==0) {
					count++;
				}
			}
			if(count>max) {
				max=count;
				a[0]=array[i];
			}
			count=0;
		}
		if(max>array.length/2) {
			return a[0];
		}else {
		return 0;
		}
	}
}
