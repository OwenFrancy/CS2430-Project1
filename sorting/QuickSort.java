/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Using quicksort using randomized pivot selection. The random number generator is implemented for multiple testing. 
 */
package sorting;

import java.util.Random;

public class QuickSort implements Sorter{
	private final Random rand = new Random(0);
	
	@Override
	public void sort(int[] a, ComparisonCounter counter) {
		quicksort(a,0, a.length - 1, counter);
	}
	
	private void quicksort(int[] a, int lo, int hi, ComparisonCounter c) {
		if (lo >= hi) {
			return;
		}
		int p = partition(a, lo, hi, c);
		quicksort(a, lo, p- 1, c);
		quicksort(a, p + 1, hi, c);
	}
	
	private int partition(int[] a, int lo, int hi, ComparisonCounter c) {
		int pivotIndex = lo + rand.nextInt(hi - lo + 1);
		int pivot = a[pivotIndex];
		swap(a, pivotIndex, hi);
		int store = lo;
		for (int i = lo; i < hi; i++) {
			c.inc();
			if (a[i] < pivot) {
				swap(a, i, store++);
			}
		}
		swap(a,store, hi);
		return store;
	}
	
	private void swap(int[] a, int i, int j) {
		int t = a[i]; a[i] = a[j]; a[j] = t;
	}
	
	@Override
	public String name() {
		return "QuickSort";
	}
}
