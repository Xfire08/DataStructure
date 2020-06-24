package Algorithm;

//URL - https://www.youtube.com/watch?v=pmEgsd1_nVg
public class QuickSort {
	public static void Quicksort(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		int i = 0;
		int j = arr.length - 1;

		while (i <= j) {

			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		if (low < j)

			Quicksort(arr, low, j);
		if (high > i)
			Quicksort(arr, i, high);
	}

	public static void main(String[] args) {		
		int[] arr = { 90, 23, 101, 45, 65, 0, 67, 89, 34, 23 };
		System.out.println("Before Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		Quicksort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("After Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}

