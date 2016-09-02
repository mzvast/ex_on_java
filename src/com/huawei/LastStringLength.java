package com.huawei;

import java.util.Scanner;

public class LastStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);			
		String input_str = in.nextLine();
		String[] array = input_str.split(" ");		
		System.out.println(array[array.length-1].length());
		
	}

}
