package com.mzvast;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		String hex = "0x10";
		while(in.hasNext()){
			String hex = in.nextLine();
			toDec(hex);
		}

	}
	
	public static void toDec(String hex) {
		String tb = "0123456789ABCDEF";
		hex = hex.substring(2);
		
		int len = hex.length();
		double dec = 0;//0x100000000会溢出
		
		while (len > 0) {
			String currentHex = hex.substring(0,1).toUpperCase();
			dec += (tb.indexOf(currentHex))*Math.pow(16, len - 1);
			
			hex = hex.substring(1);
			len = len -1;
		}
		System.out.println(dec);
		
	}

}
