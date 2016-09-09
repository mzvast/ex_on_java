package algs4.chapter2;

public class Insertion extends Example{
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
	}

	public static void main(String[] args) {
		String[] a = {"z","b","d","k","o","a","c"};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
