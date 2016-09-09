package algs4.chapter1;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	private Node first;
	private int N;//N=0
	
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first ==null;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop() {		
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}

}
