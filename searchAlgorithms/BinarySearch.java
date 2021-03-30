package searchAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {24,1,13,56,78,3456,124};
		Arrays.sort(arr);

		System.out.println(binarySearch(arr, 13));
		

	}
	
	private static int binarySearch(int[]arr, int key) {
	int start = 0;
	int end = arr.length - 1;
	
	while (start <= end) {
		int middle = (start + end)/2;
		int curr = arr[middle];
		
		if(key < curr) {
			end = middle -1; 
		}
		else if(key > curr) {
			start = middle + 1;
		}
		else {
			return middle;
		}
	}
	return -1;
}

	
}
