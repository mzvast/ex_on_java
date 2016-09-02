package com.huawei;

import java.util.Arrays;

import java.util.Scanner;


public class DicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		int n = in.nextInt();
		String enter = in.nextLine();
		String[] strArray = new String[n];
		
		for(int i = 0; i < n; i++){
			String val = in.nextLine();
			strArray[i] = val;
		}
		
		Arrays.sort(strArray);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}



