package com.xatu.day1;

/**
 * @author Administrator 找出和为n的所有整数
 */
public class face1 {
	public static void main(String[] args) {
		int n = 15;
		getAAndB(n);
	}

	/**
	 * 寻找和为n的整数
	 */
	private static void getAAndB(int n) {
		// TODO Auto-generated method stub
		int a = 1;// a为max值
		int b = 1;// b为min值
		while (b < n / 2 + 1) {
			a = n - b;
			System.out.println("n=" + a + "+" + b);
			b++;
		}
	}
}
