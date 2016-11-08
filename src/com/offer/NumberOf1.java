package com.offer;


public class NumberOf1 {
	public static int fn(int n) {
		int counter = 0;
		int flag = 1;
		while(flag != 0){
			if ((n&flag) != 0) {
				counter++;
			}
			flag <<= 1;
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(fn(-1));
	}

}
