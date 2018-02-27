/**
 * 
 */
package com.xatu.day3;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class Solution2 {
	    public ArrayList<ArrayList<String>> partition(String s) {  
	        ArrayList<ArrayList<String>> res = new ArrayList<>();  
	        ArrayList<String> list = new ArrayList<>();  
	        addPalin(res,list,s);  
	        return res;  
	    }  
	      
	    public static void addPalin(ArrayList<ArrayList<String>> result,ArrayList<String> list,String s){  
	        //当list==0的时候也就是说明这个字符串已经按照相应的的序列分好了  
	        //此时可以将其加进去了  
	        if(s.length() == 0){  
	            result.add(new ArrayList<String>(list));  
	        }  
	        for(int i = 1; i <= s.length(); i++){  
	            if(!isPali(s.substring(0,i))){  
	                continue;  
	            }  
	            //这里是从下标0-(i-1)的子串  
	            list.add(s.substring(0,i));  
	            //这里是从下标i开始的子串  
	            addPalin(result,list,s.substring(i));  
	            //这里的移除是为了重新装入新的字符串  
	            list.remove(list.size()-1);  
	        }  
	    }  
	      
	    public static boolean isPali(String str){  
	        int i = 0;  
	        int j = str.length()-1;  
	        while(i < j){  
	            if(str.charAt(i) != str.charAt(j)){  
	                return false;  
	            }  
	            i++;  
	            j--;  
	        }  
	        return true;  
	    }  
	}  
