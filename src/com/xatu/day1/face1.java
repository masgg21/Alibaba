package com.xatu.day1;

/**
 * @author Administrator �ҳ���Ϊn����������
 */
public class face1 {
	public static void main(String[] args) {
		int n = 15;
		getAAndB(n);
	}

	/**
	 * Ѱ�Һ�Ϊn������
	 */
	private static void getAAndB(int n) {
		// TODO Auto-generated method stub
		int a = 1;// aΪmaxֵ
		int b = 1;// bΪminֵ
		while (b < n / 2 + 1) {
			a = n - b;
			System.out.println("n=" + a + "+" + b);
			b++;
		}
	}
}
