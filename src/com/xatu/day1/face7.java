package com.xatu.day1;

/**
 * @author Administrator ����n�������е�1�������ò����ʾ
 */
public class face7 {
	public static void main(String[] args) {
		int n = 7;
		int numberOf = NumberOf(n);
		System.out.println(numberOf);
	}

	/**
	 * @param n
	 *            λ����
	 */
	private static int NumberOf(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}
}
