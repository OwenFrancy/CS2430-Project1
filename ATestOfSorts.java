package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ATestOfSorts {
/*
 * Heap
 */
	@Test
	public void testHeapNone() { // checking for no sorts 
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {};
		int[] output = {};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testHeap1Sort() { // checking for 1 sort
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {0};
		int[] output = {0};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testHeapSorted() { // checking for sorted
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {0, 1, 2, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testHeap4Sort() { // checking for 4 sorted numbers 
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testHeap6Sort() { 
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3, 4, 5};
		int[] output = {0, 1, 2, 3, 4, 5};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	
	@Test
	public void testHeap8Sort() { 
		HeapSort sorter = new HeapSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3, 7, 4, 5, 6};
		int[] output = {0, 1, 2, 3, 4, 5, 6, 7};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	
/*
 * merge
 */
	@Test
	public void testMergeNone() {
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {};
		int[] output = {};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testMerge1Sort() {
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2};
		int[] output = {2};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testMergeSorted() {
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {0, 1, 2, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testMerge4Sort() {
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testMerge6Sort() { 
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3, 5, 4};
		int[] output = {0, 1, 2, 3, 4, 5};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testMerge8Sort() { 
		MergeSort sorter = new MergeSort();
		ComparisonCounter counter = new ComparisonCounter();
		
		int[] input = {2, 1, 0, 3, 7, 4, 5, 6};
		int[] output = {0, 1, 2, 3, 4, 5, 6, 7};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	
	
/*
 * Quick
 */
	public void testQuickNone() { 
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {};
		int[] output = {};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testQuick1Sort() { 
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {3};
		int[] output = {3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testQuickSorted() { 
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {0, 1, 2, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testQuick4Sort() { 
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testQuick6Sort() { 
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3, 5, 4};
		int[] output = {0, 1, 2, 3, 4, 5};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testQuick8Sort() {
		QuickSort sorter = new QuickSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3, 7, 4, 5, 6};
		int[] output = {0, 1, 2, 3, 4, 5, 6, 7};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	
	/*
	 * Shaker
	 */
	@Test
	public void testShakerNone() {
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {};
		int[] output = {};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testShaker1Sort() {
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {4};
		int[] output = {4};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testShakerSorted() {
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {0, 1, 2, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testShaker4Sort() {
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3};
		int[] output = {0, 1, 2, 3};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testShaker6Sort() { 
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3, 5, 4};
		int[] output = {0, 1, 2, 3, 4, 5};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}
	@Test
	public void testShaker8Sort() { 
		ShakerSort sorter = new ShakerSort();
		ComparisonCounter counter = new ComparisonCounter();
	
		int[] input = {2, 1, 0, 3, 7, 4, 5, 6};
		int[] output = {0, 1, 2, 3, 4, 5, 6, 7};
		sorter.sort(input, counter);
		assertArrayEquals(output, input);
	}


}