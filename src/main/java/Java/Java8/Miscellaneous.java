package Java.Java8;

import java.util.Arrays;

public class Miscellaneous {

	// Example 1: Sorting Primitive Data types with Parallel Sort

	public static class SortingWithParallelSort {
		public static void main(String[] args) {
			int numbers[] = { 22, 89, 1, 32, 19, 5 };
			// Parallel Sort method for sorting int array
			Arrays.parallelSort(numbers);
			// converting the array to stream and displaying using forEach
			Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		}
	}
	
	// Example 2: Parallel Sort by specifying the start and end index
	/*
	 * We can also specify the start and end for the sorting, in this case the
	 * sub array starting from the start index and ending at the end index is
	 * sorted, the rest of the array is ignored and doesn’t get sorted.
	 */

	public static class ParallelSortByStartandEndIndex {
		public static void main(String[] args) {
			int numbers[] = { 22, 89, 1, 32, 19, 5 };
			/*
			 * Specifying the start and end index. The start index is 1 here and
			 * the end index is 5. which means the the elements starting from
			 * index 1 till index 5 would be sorted.
			 */
			Arrays.parallelSort(numbers, 1, 5);
			// converting the array to stream and displaying using forEach
			Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		}
	}
}
