package com.huawei;

import java.util.Scanner;

public class CalcCharNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input_str = in.nextLine().toLowerCase();
		String marker = in.nextLine().toLowerCase();
		String[] array = input_str.split("");		
		int counter = 0 ;
		for (int i = 0; i < array.length; i++) {			
			if (array[i] .equals(marker) ) {
				counter=counter+1;
			}			
		}
		System.out.println(counter);
	}

}
