package sortingalgorithms;

public class SelectionSort {
	public void selSort(int[] list){ 
        int n = list.length; 
 
        //one by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) { 
            //find the minimum element in unsorted array 
            int minIndex = i; 
            for(int j = i+1; j<n; j++) 
                if(list[j]<list[minIndex]) 
                    minIndex = j; 
 
            //swap the found minimum element with the first element 
            int temp = list[minIndex]; 
            list[minIndex] = list[i]; 
            list[i] = temp; 
 
 
        } 
    } 
 
    public void printArray(int list[]){ 
        int n = list.length; 
 
        for (int i = 0; i < n; ++i) { 
 
            System.out.print(list[i]+ " "); 
        } 
        System.out.println(); 
    } 
 
}

