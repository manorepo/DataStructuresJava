package Sorting;

class InsertionSort {
	public static void main(String[] a) {
		int[] A = { 1, 3, 1, 4, 2, 6 };
		doInsertionSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

	public static void doInsertionSort(int[] A) {
		int valueToInsert;
		int j;
		for (int i = 1; i < A.length; i++) {
			valueToInsert = A[i];
			for (j = i; j > 0; j--) {
				if (A[j - 1] > valueToInsert) {
					A[j] = A[j - 1];

				} else {
					break;
				}
			}
			A[j] = valueToInsert;
		}
	}
}