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
	        //��list==0��ʱ��Ҳ����˵������ַ����Ѿ�������Ӧ�ĵ����зֺ���  
	        //��ʱ���Խ���ӽ�ȥ��  
	        if(s.length() == 0){  
	            result.add(new ArrayList<String>(list));  
	        }  
	        for(int i = 1; i <= s.length(); i++){  
	            if(!isPali(s.substring(0,i))){  
	                continue;  
	            }  
	            //�����Ǵ��±�0-(i-1)���Ӵ�  
	            list.add(s.substring(0,i));  
	            //�����Ǵ��±�i��ʼ���Ӵ�  
	            addPalin(result,list,s.substring(i));  
	            //������Ƴ���Ϊ������װ���µ��ַ���  
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
