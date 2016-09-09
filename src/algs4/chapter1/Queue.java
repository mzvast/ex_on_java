package algs4.chapter1;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		for(int i:q){
			System.out.println(i);
		}
//		System.out.println(q.size());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
	}
	
	private Node first;
	private Node last;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		}else{
			oldlast.next = last;
		}
		N++;
	}
	
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		N--;
		return item;
	}	

	@Override
	public Iterator<Item> iterator() {
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
