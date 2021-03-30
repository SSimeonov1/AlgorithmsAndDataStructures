package searchAlgorithms;

import java.util.Arrays;

public class InterpolationSearch {

	public static void main(String[] args) {
		
		int[] arr = {3,4,6,14,65,87,13,76,4000,3456};
		Arrays.sort(arr);
		System.out.println(interpolationSearch(arr, 4000));

	}
	
	
	private static int interpolationSearch(int[]arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		
		while(key >= arr[start] && key <= arr[end] && start <= end) {
			
			int mid = start + (end - start) * (key - arr[start]) / (arr[end] - arr[start]);
			
			if(end == start) {
				if(arr[start] == key) {
					return start;
				}
				else {
					return -1;
				}
			}
			
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid] < key) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	
}
