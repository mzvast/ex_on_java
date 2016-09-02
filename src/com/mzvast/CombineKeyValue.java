package com.mzvast;


import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CombineKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>0){			
			int key = in.nextInt();
			int val = in.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + val);
			}else{
				map.put(key, val);
			}
			n = n -1;
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	


}
