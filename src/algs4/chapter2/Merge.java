package algs4.chapter2;

public class Merge extends Example{
	private static Comparable[] aux;
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		if (hi >= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a, lo, mid, hi);
	}
	
	public static void merge(Comparable[] a,int lo, int mid, int hi){
		int i = lo, j = mid+1;
		//copy
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		//merge aux[] back to a[]
		for(int k = lo; k <= hi; k++){
			if (i > mid) {
				a[k] = aux[j++];
			}else if (j > hi) {
				a[k] = aux[i++];
			}else if (less(aux[j],aux[i])) {
				a[k] = aux[j++];
			}else{
				a[k] = aux[i++];
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
