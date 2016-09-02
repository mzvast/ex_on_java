package com.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testArrayList();
		testLinkedList();
	}
	
	public static void testArrayList() {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add(1);
		System.out.println(list.isEmpty());
		System.out.println(list.get(0));
	}
	
	public static void testLinkedList() {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(111);
		ll.add(222);
		ll.add(333);
		
		ll.addFirst(000);
		ll.addLast(444);
		
		List sublist = ll.subList(0, 2);
		
		System.out.println(ll);
		System.out.println(sublist);
		
		Stack<Object> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		System.out.println(stack);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(1, 11);
		map.put(2, 111);
		System.out.println(map);
				
	}

}


