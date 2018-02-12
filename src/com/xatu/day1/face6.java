package com.xatu.day1;

/**
 * @author Administrator
 *
 */
public class face6 {
	public static void main(String[] args) {
		int n = 15;
		int jumpFloorII = JumpFloorII(n);
		System.out.println(jumpFloorII);
	}

	/**
	 * ÌøÌ¨½×º¯Êý
	 * 
	 * @param target
	 * @return
	 */
	public static int JumpFloorII(int target) {
		if (target < 0) {
			return 0;
		}
		int a[] = { 0, 1 };
		if (target < 2) {
			return a[target];
		} else {
			return 2 * JumpFloorII(target - 1);
		}
	}
}
