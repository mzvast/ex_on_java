package com.offer;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author mzvast
 *
 */
public class ReOrderArray {
	public static void fn(int[] array) {
		int[] aux = array.clone();
		int i = 0;
		for (int j = 0; j < aux.length; j++) {
			if(aux[j]%2 != 0) array[i++] = aux[j];
		}
		for (int k = 0; k < aux.length; k++) {
			if(aux[k]%2 == 0) array[i++] = aux[k];
		}		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		fn(a);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]);
		}
	}

}
