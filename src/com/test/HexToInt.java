package com.test;

import java.util.Scanner;

public class HexToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String input = in.nextLine();
			if (input.length()>2) {
				String niceInput = input.substring(2);
				System.err.println(Integer.parseInt(niceInput, 16));
			}		
		
		}
		in.close();
	

	}

}
