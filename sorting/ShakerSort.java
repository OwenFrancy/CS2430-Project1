/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Creates a shaker sort algorithm that sweeps left to right then right to left, "bubbling" elements into place
 */
package sorting;

/**
 * Implementation of shaker sort (bidirectional bubble sort). The algorithm
 * sweeps left-to-right and then right-to-left, bubbling elements into place.
 *
 * <p>Every element-to-element comparison is counted using the provided
 * ComparisonCounter.
 *
 * <p>Worst-case: O(n²). Best-case: O(n) when already sorted.
 */
public class ShakerSort implements Sorter{

	@Override
	public void sort(int[] a, ComparisonCounter counter) {
		int left = 0, right = a.length -1;
		while (left < right) {
			boolean swapped = false;
			for (int i = left; i < right; i++) {
				counter.inc();
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					swapped = true;
				}
			}
			right--;
			for (int i = right; i > left; i--) {
				counter.inc();
				if( a[i - 1] > a[i]) {
					swap(a, i-1, i);
					swapped = true;
				}
			}
			left++;
			if(!swapped) {
				break;
			}
		}
	}
	private void swap(int[] a, int i, int j) {
		int t = a[i]; a[i] = a[j]; a[j] = t;
	}
	
	@Override
	public String name() {
		return "ShakerSort";
	}
}
