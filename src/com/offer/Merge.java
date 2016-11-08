package com.offer;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author mzvast
 *
 */
public class Merge {
	public static ListNode newNode(int val) {
		ListNode temp = new ListNode(val);
		return temp;
	}
	public static ListNode fn(ListNode list1,ListNode list2) {		
		ListNode merge = new ListNode(0);
		ListNode head = merge;
		ListNode current = merge;
		ListNode cursor1 = list1;
		ListNode cursor2 = list2;
		while(cursor1 != null ||cursor2 != null){			
			if(cursor1 == null){
				current.next = newNode(cursor2.val);
				cursor2 = cursor2.next;
			}else if(cursor2 == null){
				current.next = newNode(cursor1.val);
				cursor1 = cursor1.next;
			}else if(cursor1.val < cursor2.val){
				current.next = newNode(cursor1.val);
				cursor1 = cursor1.next;
			}else{
				current.next = newNode(cursor2.val);
				cursor2 = cursor2.next;
			}	
			current = current.next;
		}
		
		return head.next;
	}
	public static void main(String[] args) {
		
	}

}
