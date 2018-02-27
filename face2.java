/**
 * 
 */
package com.xatu.day5;

import java.util.ArrayList;

/**
 * @author Administrator
 * ²ãÐò±éÀú¶þ²æÊ÷
 */
public class face2 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        if(root==null) return array;
         ArrayList<TreeNode> q=new ArrayList<TreeNode>();
         q.add(root);
        while(q.size()!=0){
            TreeNode tem=q.remove(0);
             if(tem.left!=null)
                    q.add(tem.left);
            if(tem.right!=null)
                q.add(tem.right);
            array.add(tem.val);
        }
            
            return array;
    }
}
