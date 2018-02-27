package com.xatu.day6;

import java.util.Stack;

/**
 * @author Administrator
 * 判断是否为栈的弹出序列
 */
public class Stack1 {
	 public boolean IsPopOrder(int [] pushA,int [] popA) {
	       if(pushA.length<=0 || popA.length<=0 )
	        {
	            return false;
	        }
	        int j=0;
	        Stack<Integer> s1=new Stack();
	        for(int i=0;i<pushA.length;i++)
	        {
	            s1.push(pushA[i]);
	            if(pushA[i] == popA[j])
	            {
	                if(j++==popA.length-1)
	                {
	                    return true;
	                }
	                s1.pop();
	            }
	        }
	        while(!s1.isEmpty())
	        {
	            if(s1.pop()!=popA[j++])
	            {
	                return false;
	            }
	        }
	        return true;
	    }
}
