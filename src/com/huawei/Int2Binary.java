package com.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Int2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int input = in.nextInt();		
		int bin = toBinaryString(input);
		System.out.println(bin);

	}
	
	public static int toBinaryString(int input) {
		Stack<Integer> stack = new Stack<Integer>();		
		while (input>1) {
			stack.push(input % 2);
			input = input / 2;
		}
		stack.push(1);
//		String ret = "";
		int counter = 0;
		while (!stack.isEmpty()) {
			int currentVal = stack.pop();
			if (currentVal == 1) {
				counter = counter + 1;
			}
		}
		return counter;
	}

}
