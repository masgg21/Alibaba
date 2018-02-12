package com.xatu.day1;

import java.time.temporal.JulianFields;

/**
 * @author Administrator
 *
 */
public class face5 {
	public static void main(String[] args) {
		int target = 20;
		int jumpFloor = JumpFloor(target);
		System.out.println(jumpFloor);
	}

	/**
	 * @param target
	 */
	private static int JumpFloor(int target) {
		// TODO Auto-generated method stub
		if (target < 0) {
			return 0;
		}
		int a[] = { 0, 1, 2 };
		if (target < 3) {
			return a[target];
		} else {
			return JumpFloor(target - 1) + JumpFloor(target - 2);
		}
	}
}
