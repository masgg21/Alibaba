package com.xatu.day1;

/**
 * @author Administrator
 * 数组反转
 */
public class face3 {
	public static void main(String[] args) {
		int[] array = { 6501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913,
				9962, 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465,
				4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6335 };
		int minNumberInRotateArray = minNumberInRotateArray(array);
		System.out.println(minNumberInRotateArray);
	}

	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int a[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[0] > array[i]) {
				int j;
				for (j = 0; j < array.length - i; j++) {
					a[j] = array[i];
					// System.out.println(a[0]);
					i++;
				}
				break;
			}
		}
		for (int n = a.length; n < array.length; n++) {
			int m = 0;
			a[n] = array[m];
		}
		return a[0];
	}
}
