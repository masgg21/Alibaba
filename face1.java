/**
 * 
 */
package com.xatu.day5;

/**
 * @author Administrator
 * ¶þ²æÊ÷µÄ¾µÏñ
 */
public class face1 {
	public void Mirror(TreeNode root) {
        if(root!=null&&(root.left!=null||root.right!=null)){  
                TreeNode tem=root.left;  
                root.left=root.right;  
                root.right=tem;  
                Mirror(root.left);  
                Mirror(root.right);  
            }  
    }
}
