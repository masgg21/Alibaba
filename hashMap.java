/**
 * 
 */
package com.xatu.day5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class hashMap {
    public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1","a");
		Map map1=new HashMap(map);
		
		System.out.println(map1.get("1"));
	}
}
