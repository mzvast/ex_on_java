package com.mzvast;

import java.util.Scanner;

public class CountWordsByType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		while (in.hasNext()) {
			char[] cs = in.nextLine().toCharArray();
			
//		char[] cs = "1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][".toCharArray();
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		for (int i = 0; i < cs.length; i++) {
			if ((cs[i] >= 'a' && cs[i] <= 'z')||(cs[i] >= 'A' && cs[i] <= 'Z')) {
				num1 ++;
			}else if (cs[i] >= '0' && cs[i] <= '9') {
				num2 ++;
			}else if(cs[i] ==' '){
				num3 ++;
			}else{
				num4 ++;
			}
		}
		
		System.out.println(num1);
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num4);
		}
		
		in.close();
		
	}
	

}
