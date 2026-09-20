/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Tracks the number of comparisons done by the sorting algorithm. ONly ordering comparisons (example: a[i] < a[j]) should increase this counter
 */
package sorting;

public class ComparisonCounter {
	private long count = 0;
	
	public void inc() {
		count++;
	}
	
	public void add(long v) {
		count += v;
	}
	
	public long get() {
		return count;
	}
	
	public void reset() {
		count = 0;
	}
}
