package com.xatu.day3;

import java.util.ArrayList;

public class Solution{
	 public ArrayList<ArrayList<String>> partition(String s) {
	    	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	        ArrayList<String> list = new ArrayList<String>();
	        
	    	if (s == null || s.length() == 0)
	    		return result;
	        
	        calResult(result,list,s);
	        return result;
	    }
	    
	    /**
	     * �ж�һ���ַ����Ƿ��ǻ����ַ���
	     */
	    private boolean isPalindrome(String str){
	    	
	    	int i = 0;
	    	int j = str.length() - 1;
	    	while (i < j){
	    		if (str.charAt(i) != str.charAt(j)){
	    			return false;
	    		}
	    		i++;
	    		j--;
	    	}
	    	return true;
	    }
	    
	    /**
	     * ����
	     * @param result : ����Ҫ�Ľ���� ArrayList<ArrayList<String>>
	     * @param list : ��ǰ�Ѿ�����ļ��� ArrayList<String>
	     * @param str : ��ǰҪ������ַ���
	     */
	    private void calResult(ArrayList<ArrayList<String>> result
	    		, ArrayList<String> list
	    		, String str)
	    {
	    	//������������ַ������ȵ���0,���������list�������������뵽�������
	    	if (str.length() == 0)
	    		result.add(new ArrayList<String>(list));
	    	int len = str.length();
	    	//�ݹ����
	    	//�ַ�����ǰ�������ж�str.substring(0, i)�Ƿ��ǻ����ַ���
	    	//����ǵĻ����������ú���calResult����str.substring(i)�ַ�������������
	    	for (int i=1; i<=len; i++){
	    		
	    		System.out.println(i);
	    		String subStr = str.substring(0, i);
	    		if (isPalindrome(subStr)){
	    			list.add(subStr);
	    			String restSubStr = str.substring(i);
	    			calResult(result,list,restSubStr);
	    			System.out.println(list);
	    			System.out.println("list����:"+list.size());
	    			list.remove(list.size()-1);
	    		}
	    		
	    	}
	    }
}
