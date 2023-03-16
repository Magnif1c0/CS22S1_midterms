package sortingalgorithms;

public class HeapSort {
	public void heapSort(int [] array){
		int n = array.length;
		for (int i = n / 2 -1; i >= 0; i--) { heapify(array, n,
		i);
		}
		for (int i = n -1; i > 0; i--) {
		int temp = array[0];array[0] = array[i];array[i] = temp;
		heapify(array, i , 0);
		}
		}
		public void heapify(int [] array, int n, int i) {
		int largest = i; int l = 2 * i + 1; int r = 2 * i + 2;
		if (l < n && array[l] > array[largest]) largest = l;
		if (r < n && array[r] > array[largest]) largest = r;
		if (largest != i) {
			int temp = array[i]; array[i] = array[largest]; array[largest] =
					temp; heapify(array, n, largest);
			}
		}	
}
