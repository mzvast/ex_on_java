package com.mzvast;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
//		int input = 9876673;
		int[] queue = new int[0];
		while (input>0) {
			int rem = input % 10;
			queue = enqueue(queue,rem);
			input = input / 10;
		}
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]);
		}

	}
	
	public static int[] enqueue(int[] queue,int rem) {
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == rem) {
				return queue;
			}			
		}
		int[] longerQueue = new int[queue.length + 1];
		for (int i = 0; i < queue.length; i++) {
			longerQueue[i] = queue[i];
		}
		longerQueue[longerQueue.length - 1] = rem;
		return longerQueue;
	}

}
