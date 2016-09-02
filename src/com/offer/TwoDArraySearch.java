package com.offer;

public class TwoDArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] input = {
				{1,2,3},
				{4,5,6},
				{7,8,9}				
		};
		System.out.println(Find(input,13));

	}
	public static boolean Find(int [][] array,int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					return true;
				}				
			}
		}
		
		return false;
    }

}
