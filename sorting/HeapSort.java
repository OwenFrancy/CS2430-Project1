/**
 * @author Owen Francy, Helen Le, Mustafa Alrubaye
 * Creates a heapsort algorithm using max-heap. The algorithm creates a heap, then repeatedly extracts the maximum element. 
 */
package sorting;

public class HeapSort implements Sorter {

    @Override
    public void sort(int[] a, ComparisonCounter counter) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(a, n, i, counter);
        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0, counter);
        }
    }

    private void heapify(int[] a, int heapSize, int root, ComparisonCounter c) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < heapSize) {
            c.inc(); 
            if (a[left] > a[largest]) largest = left;
        }
        if (right < heapSize) {
            c.inc(); 
            if (a[right] > a[largest]) largest = right;
        }
        if (largest != root) {
            swap(a, root, largest);
            heapify(a, heapSize, largest, c);
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    @Override
    public String name() { return "HeapSort"; }
}