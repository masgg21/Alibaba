package com.xatu.day2;

/**
 * @author Administrator
 *
 */
public class face3 {

	public static void main(String[] args) {
		
		ListNode listNode = new ListNode(1);
		int k = 1;
		ListNode findKthToTail = FindKthToTail(listNode, k);
		System.out.println(findKthToTail);
	}

	/**
	 * @param listNode
	 * @param k
	 */
	private static ListNode FindKthToTail(ListNode head, int k) {
		// TODO Auto-generated method stub
        
		ListNode p=head;  
	     int count = 0;  
	     while(p!=null){  
	         count++;  
	         p=p.next;  
	     }  
	     if(k>count) return null;  
	     ListNode p1=head;  
	     for(int i=0;i<count-k;i++){  
	         p1=p1.next;  
	     }  
	    return p1; 
	}
}
