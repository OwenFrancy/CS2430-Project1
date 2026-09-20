/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * This algorithm divides the array and merges sorted halves. All ordering comparisons done while merging are counted in ComparisonCounter
 */
package sorting;

public class MergeSort implements Sorter{

	@Override
	public void sort(int[] a, ComparisonCounter counter) {
		if(a == null || a.length <= 1) {
			return;
		}
		int[] aux = new int[a.length];
		mergesort(a, aux, 0, a.length - 1, counter);
	}
	
	private void mergesort(int[] a, int[] aux, int lo, int hi, ComparisonCounter c) {
		if (lo >=hi) {
			return;
		}
		int mid = (lo + hi) >>> 1;
		mergesort(a, aux, lo, mid, c);
		mergesort(a, aux, mid + 1, hi, c);
		merge(a, aux, lo, mid, hi, c);
	}
	
	private void merge(int[] a, int[] aux, int lo, int mid, int hi, ComparisonCounter c) {
		System.arraycopy(aux,  lo, aux, lo, hi - lo + 1);
		int i = lo, j = mid + 1, k = lo;
		while (i <= mid && j <= hi) {
			c.inc();
			if (aux[i] <= aux[j]) {
				a[k++] = aux[i++];
			} else {
				a[k++] = aux[j++];
			}
		}
		while (i <= mid) {
			a[k++] = aux[i++];
		}
		while (j <= hi) {
			a[k++] = aux[j++];
		}
	}
	
	@Override
	public String name() {
		return "MergeSort" ;
	}
}
