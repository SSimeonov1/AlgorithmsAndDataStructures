package sortAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		
      int[] arr = {76,45,787,124,766,54564,34,92,13}; 
	
		sort(arr);
				
		for (int number : arr) {
			System.out.println(number);
		}
		

	}
	
	
	public static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
		}
	
	
		private static void mergeSort(int[] arr, int begin, int end) {
			if(begin >= end) {
				return;
			}
			
			int mid = (begin + end) / 2;
			
			mergeSort(arr, begin, mid);
			mergeSort(arr, mid + 1, end);
			
			merge(arr, begin, mid, end);
		}
		
		
		private static void merge(int[] arr, int begin, int mid, int end) {
			if(mid < 0 || mid >= arr.length || arr[mid] < arr[mid + 1]) {
				return;
			}
			
			int left = begin;
			int right = mid + 1;
			
			int[] helperArray = new int[arr.length];
			
			for (int i = begin; i <= end; i++) {
				helperArray[i] = arr[i];
			}
			
			for (int i = begin; i <= end; i++) {
				if(left > mid) {
					arr[i] = helperArray[right++];
				}
				else if(right > end) {
					arr[i] = helperArray[left++];
				}
				else if(helperArray[left] < helperArray[right]) {
					arr[i] = helperArray[left++];
				}
				else {
					arr[i] = helperArray[right++];
				}
			}
		}

		
}
