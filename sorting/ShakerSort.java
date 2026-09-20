/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Creates a shaker sort algorithm that sweeps left to right then right to left, "bubbling" elements into place
 */
package sorting;

public class ShakerSort implements Sorter{

	@Override
	public void sort(int[] a, ComparisonCounter counter) {
		int left = 0, right = a.length -1;
		while (left < right) {
			boolean swapped = false;
			for (int i = left; i < right; i++) {
				counter.inc();
				if (a[i] > a[i + 1]) {
					swap(a, i - 1, i);
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
