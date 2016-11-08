package com.offer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author mzvast
 *
 */
public class FindKthToTail {
	public static ListNode fn(ListNode head,int k) {
		if (head == null || k == 0) return null;
		ListNode node_fast = head;
		ListNode node_slow = head;
		int i = 0;
		while(i<k){
			if(node_fast == null) return null;
			i++;
			node_fast = node_fast.next;
		}
		while(node_fast != null){
			node_fast = node_fast.next;
			node_slow = node_slow.next;
		}
		
		return node_slow;
	}
	public static void main(String[] args) {		
		ListNode ls0 = new ListNode(0);
		ListNode ls1 = new ListNode(1);
		ListNode ls2 = new ListNode(2);
		ListNode ls3 = new ListNode(3);
		ListNode ls4 = new ListNode(4);
		ListNode ls5 = new ListNode(5);
		ls0.next = ls1;
		ls1.next = ls2;
		ls2.next = ls3;
		ls3.next = ls4;
		ls4.next = ls5;
		System.out.println(fn(ls0, 3).val);
	}

}
