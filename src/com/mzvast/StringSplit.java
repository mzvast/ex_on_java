package com.mzvast;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int counter = 2;
		while (in.hasNext() && counter > 0) {
			String str = in.nextLine();
			split(str);
			counter = counter - 1;
		}

	}
	
	public static void split(String str) {
		while (str.length() >= 8) {
			System.out.println(str.substring(0,8));
			str = str.substring(8);			
		}
		
		if (str.length() >0 && str.length() <8) {
			str = str + "00000000";
			System.out.println(str.substring(0,8));
		}
		
		
		
		
		
		
	}

}
