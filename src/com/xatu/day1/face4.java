package com.xatu.day1;

/**
 * @author Administrator
 *
 */
public class face4 {
	public static void main(String[] args) {
		int n = 15;
		int fibonacci = Fibonacci(n);
		System.out.println(fibonacci);
	}

	// ì³²¨ÄÇÆõÊýÁÐ
	// F(n)=F(n-1)+F(n-2);
	public static int Fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
