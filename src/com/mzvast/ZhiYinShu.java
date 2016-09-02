package com.mzvast;

import java.util.Scanner;

public class ZhiYinShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long big = in.nextLong();
//		long big = 180;
		breakDown(big);
	}
	
	public static void breakDown(long big) {
		for (int i = 2; i <= big;) {
			if (big%i == 0) {
				System.out.print(i+" ");
				big = big / i;
			}else {
				i = i +1;
			}
		}
//		System.out.println(big+" ");
	}

}
