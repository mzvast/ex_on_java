package com.offer;

public class ReConstructBinaryTree {
	public static TreeNode fn(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
		if(preStart>preEnd||inStart>inEnd) return null;
		TreeNode root = new TreeNode(pre[preStart]);
		for(int i = inStart; i <= inEnd; i++){
			if (pre[preStart] == in[i]) {	
				root.left = fn(pre, in, preStart + 1, preStart + (i - inStart), inStart, i - 1);
				root.right = fn(pre, in, preStart + i - inStart + 1, preEnd, i + 1, inEnd);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		System.out.println(fn(pre,in,0,pre.length-1,0,in.length-1));
	}

}
