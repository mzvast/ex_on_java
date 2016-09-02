/*http://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&tqId=21226&rp=&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking*/
package com.mzvast;

import java.util.Scanner;

public class Random{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {//注意要用到hasNext()否则测试会通不过
			int n = in.nextInt();
			int[] array = new int[0];
			for (int i = 0; i < n; i++) {
				int val = in.nextInt();
				array = push(array,val);
			}
			int[] sortedArray = sort(array);
			
			for (int i = 0; i < sortedArray.length; i++) {
				System.out.println(sortedArray[i]);
			}
		}		
		
	}
	/*去重*/
	public static int[] push(int[] array,int val){
		for (int i = 0; i < array.length; i++) {
			if (array[i] == val) {//有重复，返回原数组
				return array;
			}
		}
		int[] newArray = new int[array.length+1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];			
		}
		newArray[array.length] = val;
		return newArray;
	}
	/*排序*/
	public static int[] sort(int[] array){
		int[] sortedArray = array;
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = 0; j < sortedArray.length-i-1; j++) {
				if (sortedArray[j]>sortedArray[j+1]) {
					int tmp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = tmp;
				}
			}
		}
		return sortedArray;
	}

}
