package com.offer;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author mzvast
 *
 */
public class minNumberInRotateArray {
	public static int find(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while(low < high){
			int mid = (high + low)/2;
			if (arr[mid] > arr[high]) {
				low = mid + 1;
			}else if(arr[mid] == arr[high]){
				high--;
			}else{
				high = mid;
			}
		}
		return arr[low];		
	}
	
	public static void main(String[] args) {
		int[] in1 = {3,4,5,1,2};		
		int[] in2 = {1,1,1,0,1};		
		System.out.println(find(in1));
		System.out.println(find(in2));
	}

}
