/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * 
 * Main driver: runs experiments for n = 4, 6, 8 and prints best/worst/average.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final Sorter[] SORTERS = new Sorter[] {
        new MergeSort(),
        new QuickSort(),
        new ShakerSort(),
        new HeapSort()
    };

    public static void main(String[] args) {
        int[] ns = {4, 6, 8};
        for (int n : ns) {
            System.out.println("=== n = " + n + " ===");
            List<int[]> poss = PossibilityGen.generate(n);
            System.out.println("Total possibilities: " + poss.size());
            for (Sorter sorter : SORTERS) {
                runExperiment(sorter, poss, n);
            }
            System.out.println();
        }
    }

    private static void runExperiment(Sorter sorter, List<int[]> perms, int n) {
        List<Result> results = new ArrayList<>(perms.size());
        ComparisonCounter counter = new ComparisonCounter();

        for (int[] p : perms) {
            int[] copy = p.clone();
            counter.reset();
            sorter.sort(copy, counter);
            results.add(new Result(p, counter.get()));
        }

        Collections.sort(results);
        double avg = results.stream().mapToLong(r -> r.comparisons).average().orElse(0.0);

        System.out.println("Algorithm: " + sorter.name());
        System.out.println("Average comparisons: " + String.format("%.2f", avg));

        System.out.println("Best 10 cases:");
        for (int i = 0; i < Math.min(10, results.size()); i++) {
            System.out.println("  " + (i+1) + ". " + results.get(i));
        }

        System.out.println("Worst 10 cases:");
        for (int i = 0; i < Math.min(10, results.size()); i++) {
            Result r = results.get(results.size() - 1 - i);
            System.out.println("  " + (i+1) + ". " + r);
        }
        System.out.println();
    }
}