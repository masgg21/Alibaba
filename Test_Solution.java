/**
 * 
 */
package com.xatu.day3;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class Test_Solution {
   public static void main(String[] args) {
	Solution s=new Solution();
	String str="aab";
	ArrayList<ArrayList<String>> partition = s.partition(str);
	for (int i = 0; i < partition.size(); i++) {
		System.out.println(partition.get(i));
	}
}
}
