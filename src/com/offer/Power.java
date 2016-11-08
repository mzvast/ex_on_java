package com.offer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author mzvast
 *
 */
public class Power {
	public static double fn(double base, int exponent) {
		double result = 1.0;
		boolean flag = false;
		if(exponent < 0){
			flag = true;
			exponent *= -1;			
		}
		
			for (int i = 1; i <= exponent; i++) {
				result *= base;
			}
		if(flag) result = 1/result;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(fn(10,-2));
	}

}
