package sortingalgorithms;

public class SortingAlgorithmRunningTime {

	public static void main(String[] args) {
		 System.out.println ("Array of 1,000 numbers"); 
	        for (int count = 1; count < 30; count++) { 
	            if (count == 1) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[1000]; 
	                for (int i = 0; i < 1000; i++) { 
	                    data[i] = (int) (Math.random () * 0x3E8); 
	                } 
	                BubbleSort bs = new BubbleSort (); 
	                bs.bubbleSort (data); 
	                long endTime1 = System.currentTimeMillis (); 
	                long elapseTime = endTime1 - startTime; 
	                System.out.println ("the execution time of a bubble sort is " + elapseTime + " ms"); 
	            } 
	            else if (count == 2) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[1000]; 
	                for (int i = 0; i < 1000; i++) { 
	                    data[i] = (int) (Math.random () * 0x3E8); 
	                } 
	                QuickSort qs = new QuickSort (); 
	                int n = data.length; 
	                qs.quickSortRunner (data, 0, n - 1); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a quick sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 3) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[1000]; 
	                for (int i = 0; i < 1000; i++) { 
	                    data[i] = (int) (Math.random () * 0x3E8); 
	                } 
	                ShellSort sh = new ShellSort (); 
	                int n = data.length; 
	                sh.doShellSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a shell sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 4) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[1000]; 
	                for (int i = 0; i < 1000; i++) { 
	                    data[i] = (int) (Math.random () * 0x3E8); 
	                } 
	                InsertionSort is = new InsertionSort (); 
	                int n = data.length; 
	                is.doInSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a insertion sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 5) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[1000]; 
	                for (int i = 0; i < 1000; i++) { 
	                    data[i] = (int) (Math.random () * 0x3E8); 
	                } 
	                SelectionSort ss = new SelectionSort (); 
	                ss.selSort (data); 
	                long endTime3 = System.currentTimeMillis (); 
	                long elapseTime = endTime3 - startTime; 
	                System.out.println ("the execution time of a selection sort is " + elapseTime + " ms"); 
	            }
	            else if (count == 6) {
	            	long startTime = System.currentTimeMillis();
	            	int[] data = new int[1000];
	            	for (int i = 0; i < 1000; i++) {
	            	data[i] = (int) (Math.random() * 0x3E8);
	            	}
	            	HeapSort ss = new HeapSort(); ss.heapSort(data);
	            	long endTime3 = System.currentTimeMillis();
	            	long elapseTime = endTime3 -startTime;
	            	System.out.println("the execution time of a Heap sort is "+ elapseTime + " ms");
	            }
	            	else if (count == 7) {
	            		long startTime = System.currentTimeMillis();
	            		int[] data = new int[1000];
	            		for (int i = 0; i < 1000; i++) {
	            		data[i] = (int) (Math.random() * 0x3E8);
	            		}
	            		MergeSort ms = new MergeSort();
	            		ms.mergeSort(data, count, count);
	            		long endTime3 = System.currentTimeMillis();
	            		long elapseTime = endTime3 - startTime;
	            		System.out.println("The execution time of a Merge sort is " + elapseTime + " ms");
	            		
	            	}
	            	else if (count == 8) { 
	                    long startTime = System.currentTimeMillis(); 
	                    int[] data = new int[1000]; 
	                    for (int i = 0; i < 1000; i++) { 
	                        data[i] = (int) (Math.random() * 0x3E8); 
	                    } 
	                    RadixSort rs = new RadixSort(); 
	                    rs.radixSort(data); 
	                    long endTime3 = System.currentTimeMillis();
	                    long elapseTime = endTime3 - startTime; 
	                    System.out.println("the execution time of a Radix sort is " + elapseTime + " ms");
	            		
	            		System.out.println ("Array of 10,000 numbers"); 
	            }	        
	            else if (count == 9) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[10000]; 
	                for (int i = 0; i < 10000; i++) { 
	                    data[i] = (int) (Math.random () * 0x2710); 
	                } 
	                BubbleSort bs = new BubbleSort (); 
	                bs.bubbleSort (data); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Bubble Sort is " + elapseTime + " ms"); 
	            } 
	            else if (count == 10) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[10000]; 
	                for (int i = 0; i < 10000; i++) { 
	                    data[i] = (int) (Math.random () * 0x2710); 
	                } 
	                QuickSort qs = new QuickSort (); 
	                int n = data.length; 
	                qs.quickSortRunner (data, 0, n - 1); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Quick Sort is " + elapseTime + " ms"); 
	            } 
	            else if (count == 11) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[10000]; 
	                for (int i = 0; i < 10000; i++) { 
	                    data[i] = (int) (Math.random () * 0x2710); 
	                } 
	                ShellSort sh = new ShellSort (); 
	                int n = data.length; 
	                sh.doShellSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a shell sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 12) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[10000]; 
	                for (int i = 0; i < 10000; i++) { 
	                    data[i] = (int) (Math.random () * 0x2710); 
	                } 
	                InsertionSort is = new InsertionSort (); 
	                int n = data.length; 
	                is.doInSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a insertion sort is " + elapseTime + " ms"); 
	           
	            }
	            else if (count == 13) {
	            	long startTime = System.currentTimeMillis();
	            	int[] data = new int[10000];
	            	for (int i = 0; i < 10000; i++) {
	            	data[i] = (int) (Math.random() * 0x2710);
	            	}
	            	HeapSort ss = new HeapSort(); ss.heapSort(data);
	            	long endTime = System.currentTimeMillis();
	            	long elapseTime = endTime -startTime;
	            	System.out.println("the execution time of a Heap Sort is " + elapseTime + " ms");
	            
	 
	            } 
	            else if (count == 14) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[10000]; 
	                for (int i = 0; i < 10000; i++) { 
	                    data[i] = (int) (Math.random () * 0x2710); 
	                } 
	                SelectionSort ss = new SelectionSort (); 
	                ss.selSort (data); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Selection Sort is " + elapseTime + " ms"); 
	            } 
	            else if (count == 15) {
	            	long startTime = System.currentTimeMillis();
	            	int[] data = new int[10000];
	            	for (int i = 0; i < 10000; i++) {
	            	data[i] = (int) (Math.random() * 0x2710);
	            	}
	            	MergeSort ms = new MergeSort();
            		ms.mergeSort(data, count, count);
	            	long endTime = System.currentTimeMillis();
	            	long elapseTime = endTime - startTime;
	            	System.out.println("The execution time of a Merge Sort is " + elapseTime + " ms");
	            }
	            	else if (count == 16) { 
	                    long startTime = System.currentTimeMillis(); 
	                    int[] data = new int[10000]; 
	                    for (int i = 0; i < 10000; i++) { 
	                        data[i] = (int) (Math.random() * 0x2710); 
	                    }
	                    RadixSort rs= new RadixSort(); 
	                    rs.radixSort(data); 
	                    long endTime = System.currentTimeMillis(); 
	                    long elapseTime = endTime - startTime; 
	                    System.out.println("the execution time of a Radix Sort is " + elapseTime + " ms");
	            	System.out.println ("Array of 100,000 numbers"); 
	            } 
	            else if (count == 17) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random () * 0x186A0); 
	                } 
	                BubbleSort bs = new BubbleSort (); 
	                bs.bubbleSort (data); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Bubble Sort is " + elapseTime + " ms"); 
	            } 
	            else if (count == 18) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random () * 0x186A0); 
	                } 
	                QuickSort qs = new QuickSort (); 
	                int n = data.length; 
	                qs.quickSortRunner (data, 0, n - 1); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Quick Sort is " + elapseTime + "ms"); 
	            } 
	            else if (count == 19) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random () * 0x186A0); 
	                } 
	                ShellSort sh = new ShellSort (); 
	                int n = data.length; 
	                sh.doShellSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a shell sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 20) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random () * 0x186A0); 
	                } 
	                InsertionSort is = new InsertionSort (); 
	                int n = data.length; 
	                is.doInSort (data); 
	                long endTime2 = System.currentTimeMillis (); 
	                long elapseTime = endTime2 - startTime; 
	                System.out.println ("the execution time of a insertion sort is " + elapseTime + " ms"); 
	 
	            } 
	            else if (count == 21) { 
	                long startTime = System.currentTimeMillis (); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random () * 0x186A0); 
	                } 
	                SelectionSort ss = new SelectionSort (); 
	                ss.selSort (data); 
	                long endTime = System.currentTimeMillis (); 
	                long elapseTime = endTime - startTime; 
	                System.out.println ("the execution time of a Selection Sort is " + elapseTime + " ms"); 
	            } 
	        	
	        	else if (count == 22) {
	        	long startTime = System.currentTimeMillis();
	        	int[] data = new int[100000];
	        	for (int i = 0; i < 100000; i++) {
	        	data[i] = (int) (Math.random() * 0x186A0);
	        	}
	        	HeapSort ss = new HeapSort(); 
	        	ss.heapSort(data);
	        	long endTime = System.currentTimeMillis();
	        	long elapseTime = endTime -startTime;
	        	System.out.println("the execution time of a Heap Sort is " + elapseTime + " ms");
	        	
	            
	        } else if (count == 23) {
	        	long startTime = System.currentTimeMillis();
	        	int[] data = new int[100000];
	        	for (int i = 0; i < 100000; i++) {
	        	data[i] = (int) (Math.random() * 0x186A0);
	        	}
	            MergeSort ms = new MergeSort();
        		ms.mergeSort(data, count, count);
	        	long endTime = System.currentTimeMillis();
	        	long elapseTime = endTime - startTime;
	        	System.out.println("The execution time of a Merge Sort is " + elapseTime + " ms");
	        }
	        	else if (count == 24) {
	        		long startTime = System.currentTimeMillis(); 
	                int[] data = new int[100000]; 
	                for (int i = 0; i < 100000; i++) { 
	                    data[i] = (int) (Math.random() * 0x186A0); 
	                } 
	                RadixSort rs = new RadixSort(); 
	                rs.radixSort(data); 
	                long endTime = System.currentTimeMillis(); 
	                long elapseTime = endTime - startTime; 
	                System.out.println("the execution time of a Radix Sort is " + elapseTime + " ms"); 
	        } 
	    } 
	}
}



