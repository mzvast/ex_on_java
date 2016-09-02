package com.offer;

import java.util.ArrayList;

public class ReConstructBinaryTree_with_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		System.out.println(reConstructBinaryTree(pre,0,pre.length-1, in,0,in.length-1));
	}
	
	public static TreeNode reConstructBinaryTree(int [] pre,int preStart,int preEnd,int [] in,int inStart,int inEnd) {
       if (preStart>preEnd||inStart>inEnd) {
		return null;
       }
       
       TreeNode root = new TreeNode(pre[preStart]);
       
       for (int i = inStart; i < inEnd; i++) {
			if (pre[preStart] == in[i]) {
				root.left = reConstructBinaryTree(pre, preStart+1, preStart + i -inStart, in, inStart, i-1);
				root.right = reConstructBinaryTree(pre, i - inStart + preStart + 1, preEnd, in, i+1, inEnd);
			}
		}
       return root;
    }
	

}
