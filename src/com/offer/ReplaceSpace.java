package com.offer;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc deff  asfas");
		System.out.println(replaceSpace(sb));
	}
	
	public static String replaceSpace(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}else{
				sb.append("%20");
			}
		}
    	return sb.toString();
    }

}
