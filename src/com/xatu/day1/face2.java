package com.xatu.day1;

/**
 * @author Administrator 寻找和为n的连续整数序列
 */
public class face2 {
	public static void main(String[] args) {
		getAns(15);
	}

	/**
	 * @param n
	 */
	private static void getAns(int n) {
		// TODO Auto-generated method stub
		int max = 1;
		int min = 1;
		int sum = 1;
		while (min < n / 2 + 1) {
			if (sum == n) {
				for (int k = min; k <= max; k++) {
					System.out.print(k + "  ");
				}
				System.out.println();
				sum = sum - min;
				min++;
				max++;
				sum = sum + max;
			}
			if (sum > n) {
				sum = sum - min;
				min++;
			} else {
				max++;
				sum = sum + max;
			}
		}
	}
}
