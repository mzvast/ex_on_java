package com.offer;

public class Fibonacci {	
	
	public static int[] memo = new int[40];
	
	public static int Fib(int n) {
		int val = memo[n];
		if(val != 0) return val;
		if(n == 0||n == 1){
			val = n;
			memo[n] = val;
			return val;
		}else{
			val = Fib(n-1) + Fib(n-2);
			memo[n] = val;
			return val;
		}
		
	}

	public static void main(String[] args) {	
		for (int i = 0; i < 40; i++) {
			System.out.print("["+i+"]"+Fib(i)+" ");
		}
		
//		show(memo);
	}

}
