/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Represents the result of running a sorting algorithm for a single possibility. Stored original input array and the number of comparisons performed. 
 */
package sorting;

public class Result implements Comparable<Result>{
	public final int[] input;
	public final long comparisons;
	
	public Result(int[] input, long comparisons) {
		this.input = input.clone();
		this.comparisons = comparisons;
	}
	
	@Override
	public int compareTo(Result o) {
		return Long.compare(this.comparisons, o.comparisons);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < input.length; i++) {
			if (i > 0) sb.append(",");
			sb.append(input[i]);
		}
		sb.append("] -> ").append(comparisons);
		return sb.toString();
	}
}
