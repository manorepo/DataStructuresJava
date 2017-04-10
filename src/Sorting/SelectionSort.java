package Sorting;

class SelectionSort {
	public static void main(String[] a) {
		int[] A = { 1, 3, 1, 4, 2, 6 };
		doSelectionSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

	public static void doSelectionSort(int[] A) {
		int curr;
		int j;
		int minIndex;
		for (int i = 0; i < A.length; i++) {
			curr = A[i];
			minIndex = i;
			for (j = i + 1; j < A.length; j++) {
				if (A[j] < A[minIndex]) {
					minIndex = j;
				}
			}
			A[i] = A[minIndex];
			A[minIndex] = curr;
		}
	}
}