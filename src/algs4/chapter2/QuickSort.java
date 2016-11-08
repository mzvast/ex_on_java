package algs4.chapter2;

public class QuickSort {
	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if(!less(a[i-1], a[i])) return false;
		}
		return true;
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w)<0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[]a, int lo, int hi){
		if(hi <= lo) return;
		int j = partition(a, lo, hi);//a[j] is in position
		sort(a, lo, j-1);
		sort(a, j+1,hi);
	}
	
	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		Comparable v = a[lo];
		while (true) {
			while(less(a[++i],v)) if(i == hi) break;
			while(less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}

	public static void main(String[] args) {
		String[] a = {"z","b","d","k","o","a","c"};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
