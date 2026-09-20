
/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Creates all possible variants of integers within 0 through n-1. 
 * Determines and produces each possibility exactly once.
 * 
 * Example for n = 3:
 * [0,1,2], [0,2,1], [1,0,2], [1,2,0], [2,0,1], [2,1,0]
 */
package sorting;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class PossibilityGen {

	public static List<int[]> generate(int n){
		List<int[]> poss = new ArrayList<>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			poss.add(a.clone());
		} while (nextPossibility(a)){
			poss.add(a.clone());
		}
		return poss;
	}
	
	private static boolean nextPossibility(int[] a) {
		int n = a.length;
		int i = n - 2;
		while (i >= 0 && a[i] >= a[i + 1]) {
			i--;
		}
		if (i < 0) {
			return false;
		}
		int j = n - 1;
		while (a[j] <= a[i]) {
			j--;
		}
		swap(a, i, j);
		reverse(a, i + 1, n - 1);
		return true;
	}
	
	public static void swap(int[] a, int i, int j) {
		int t = a[i]; a[i] = a[j]; a[j] = t;
	}
	
	public static void reverse(int[] a, int i, int j) {
		while ( i < j) {
			swap(a, i++, j--);
		}
	}
}
