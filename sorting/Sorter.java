/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Interface for sorting algorithms used in testing
 */
package sorting;

public interface Sorter {
	void sort(int[] a, ComparisonCounter counter);
	
	String name();
}
