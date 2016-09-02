package com.offer;

import java.util.Arrays;

public class ReConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		System.out.println(reConstructBinaryTree(pre,in).right.right.left.val);
//		int [] sub = slice(in, 0, 3);
//		System.out.println(sub);
	}
	
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length == 0){
			return null;
		}
		
		int val = pre[0];
		TreeNode root = new TreeNode(val);
		
		
		for (int i = 0; i < in.length; i++) {
			if (in[i] == val) {
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
//				root.left = reConstructBinaryTree(slice(pre, 1, i), slice(in, 0, i-1));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
//				root.right = reConstructBinaryTree(slice(pre, i+1, pre.length-1), slice(in, i+1, in.length-1));
			}
		}
       return root;
    }
	
	public static int[] slice(int[] arr,int start,int end) {		
		int[] new_arr = new int[end - start +1];
		for (int i = start,j = 0; i <= end; i++,j++) {
			new_arr[j] = arr[i];
		}
		return new_arr;
	}
	

}
