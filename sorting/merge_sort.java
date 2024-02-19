class MergeSort {

    public static void main(String[] args) {

        int[] arr = {12, 13, 42, 32, 54, 86, 21, 8, 6, 4, 5, 7};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        mergeSort.printArray(arr);

    }


    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    void sort(int[] arr, int left, int right) {
        if (left > right) return;

        int mid = left + (right - 1) / 2;

        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    void merge(int[] arr, int left, int mid, int right) {

        // find sizes of both sub-arrays to be sorted
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // creating temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

        // starting to merge
        // initial indexes for first and second sub arrays
        int i = 0, j = 0;

        // initial index for merged sub-array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[i]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // adding remaining elements of L[] (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // adding remaining elements of R[] (if any)
        while (j < n1) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}







