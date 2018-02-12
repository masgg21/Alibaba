package com.xatu.day1;

/**
 * @author Administrator
 *
 */
public class face8 {
	public static void main(String[] args) {
		int n = 16;
		int rectCover = RectCover(n);
		System.out.println(rectCover);
	}

	public static int RectCover(int target) {
		if (target <= 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return RectCover(target - 1) + RectCover(target - 2);
		}
	}
}
