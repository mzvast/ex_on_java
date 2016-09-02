package com.mzvast;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
//		String input = "uqic^g`(s&jnl(m#vt!onwdj(ru+os&wx";
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			int asc = input.codePointAt(i);			
			if (asc>=0&&asc<=127) {
				map.put(asc, 1);
			}
		}		
		System.out.println(map.size());

	}

}
