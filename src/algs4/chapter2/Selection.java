package algs4.chapter2;

public class Selection extends Example{
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				if(less(a[j], a[min])){
					min = j;
				}
			}
			exch(a, i, min);
		}
	}

	public static void main(String[] args) {
		String[] a = {"z","b","d","k","o","a","c"};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
