package com.offer;


/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * @author mzvast
 *
 */
public class ReverseList {
	public static ListNode fn(ListNode head) {
		if (head == null) return null;
		ListNode pre = null;
		ListNode next = null;
		ListNode current = head;
		
		while(current != null ){
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		return pre;
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
		
		ListNode root = fn(ls0);
		ListNode current = root;
		while(current != null){
			System.out.print(current.val);
			current = current.next;
		}
		

	}

}
