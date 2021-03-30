package sortAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		int[] arr = {12,54,6546,678,12,1,13,43,65};
		sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		

		
	}
	
	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int position = i;
			while(position > 0 && arr[position - 1 ] > key) {
				arr[position] = arr[position - 1];
				position--;
			}
			arr[position] = key;
		}
	}

		
}
