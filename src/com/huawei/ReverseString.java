package com.huawei;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		for (int i = input.length - 1;i >= 0;  i--) {
			System.out.print(input[i]);
			if (i != 0) {
				System.out.print(" ");
			}
		}

	}

}
