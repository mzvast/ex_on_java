package com.mzvast;

import java.util.Scanner;

public class Approximate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float floatNumber = in.nextFloat();
		
		doApproximate(floatNumber);

	}
	
	public static void doApproximate(float floatNumber) {
		int beforeDot = (int)floatNumber;
		float afterDot = floatNumber - beforeDot;
		if (afterDot >= 0.5) {
			System.out.println(beforeDot + 1);
		}else {
			System.out.println(beforeDot);
		}
	}
}
