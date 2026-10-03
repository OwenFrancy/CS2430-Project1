/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Interface for sorting algorithms used in testing
 */
package sorting;

/**
 * Interface for sorting algorithms used in the experiment.
 * <p>
 * Implementations must:
 * <ul>
 *   <li>Sort the array in-place</li>
 *   <li>Increment the provided ComparisonCounter exactly once per
 *       element-to-element ordering comparison</li>
 *   <li>Not count non-ordering comparisons</li>
 * </ul>
 */
public interface Sorter {

	/**
     * Sorts the array in-place while counting ordering comparisons.
     *
     * @param a array to sort
     * @param counter comparison counter
     */
	void sort(int[] a, ComparisonCounter counter);

	/**
     * Returns the algorithm's name for reporting purposes.
     *
     * @return name of the sorting algorithm
     */
	String name();
}
