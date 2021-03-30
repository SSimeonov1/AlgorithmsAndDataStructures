package sortAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,32,65,76,2,88,11,13,252};
		sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		

	}
	
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		   
		}
	
	
		private static void swap(int[] arr, int first, int second) {
			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}

		
}
