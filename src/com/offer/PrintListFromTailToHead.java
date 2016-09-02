package com.offer;

import java.util.ArrayList;

public class PrintListFromTailToHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		System.out.println(printListFromTailToHead(l1));
		
	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arr = new ArrayList<>();		
		while(listNode != null){			
			arr.add(listNode.val);
			listNode = listNode.next;
//			System.out.println(listNode.val);
		}
		int n = arr.size();
		for (int i = 0; i < n/2; i++) {
			Integer temp = arr.get(i);
			arr.set(i, arr.get(n - i -1));
			arr.set(n - i - 1, temp);
		}
        return arr;
    }

}
