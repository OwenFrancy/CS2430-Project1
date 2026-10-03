/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Tracks the number of comparisons done by the sorting algorithm. ONly ordering comparisons (example: a[i] < a[j]) should increase this counter
 */
package sorting;

/**
 * Tracks the number of element-to-element ordering comparisons performed by
 * a sorting algorithm. Only comparisons that determine ordering (e.g., a[i] < a[j])
 * should increment this counter.
 *
 * <p>Loop bounds checks, index comparisons, and other control comparisons must
 * not be counted.
 */
public class ComparisonCounter {
	private long count = 0;

	/** Increments the comparison count by one. */
	public void inc() {
		count++;
	}

	/** Adds a specified number of comparisons. */
	public void add(long v) {
		count += v;
	}

	/** Returns the current comparison count. */
	public long get() {
		return count;
	}

	/** Resets the counter to zero. */
	public void reset() {
		count = 0;
	}
}
