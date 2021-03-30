package sortAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {1,54,2,876,43,7645,22,5};
		
		sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}

		
	}
	
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++ ) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			swap(arr, i, index);
		}
	}
	
	
	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

		
}
