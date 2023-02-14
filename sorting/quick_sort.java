class QuickSort {

	public static void main(String[] args) {

		int[] arr = {12,23,2345,45,656,73,45,4534,65,67,634,52,464,67,45,4653};

		QuickSort quickSort = new QuickSort();

		quickSort.quickSort(arr, 0, arr.length - 1);

		for (int i: arr) {
			System.out.print(i + " ");
		}

	}


	/*
		@param arr -> data
		@param low -> starting index
		@param high -> ending index
	*/
	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			// pi is the partioning index
			int pi = partition(arr, low, high);


			quickSort(arr, low, pi - 1);

			quickSort(arr, pi + 1, high);
		}
	}


	/* 	
	This function takes the last element as the pivot, 
	place element at its correct position in sorted array, and
	place all smaller elements to left of pivot and,
	place all larger elements to right of pivot
	*/
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		/* index of smaller element & indicates the right position
		of pivot is found so far */
		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {
			// if current element is less than pivot
			if(arr[j] < pivot) {
				i++; // increment index of smaller element

				// swap arr[i] and arr[j]
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}