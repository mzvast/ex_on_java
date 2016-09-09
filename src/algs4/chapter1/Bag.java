package algs4.chapter1;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
	
	public static void main(String[] args) {
		Bag<Integer> bag = new Bag<>();
		bag.add(1);
		bag.add(2);
		bag.add(3);
//		System.out.println(bag.size());
		for(int i:bag){
			System.out.println(i);
		}
	}
	
	private Node first;
	private int N;//N=0
	private class Node{
		Item item;
		Node next;
	}
	
	private boolean isEmpty(){
		return first == null;
	}
	
	private void add(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public int size() {
		return N;
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
