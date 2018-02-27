/**
 * 
 */
package com.xatu.day4;

/**
 * @author Administrator
 * ÉıĞòÅÅĞò
 */
public class cmpUp implements IntCompare {

	/* (non-Javadoc)
	 * @see com.xatu.day4.IntCompare#cmp(int, int)
	 */
	@Override
	public int cmp(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)
			return 1;
		else if(a<b)
			return -1;
		else
		    return 0;
	}

}
