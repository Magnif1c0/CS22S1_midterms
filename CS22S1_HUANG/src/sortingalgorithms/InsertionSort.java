package sortingalgorithms;

public class InsertionSort {
	// method to sort using insertion sort 
    public void doInSort(int list[]){ 
        int n = list.length; 
        for (int i = 0; i < n; i++) { 
            int key = list[i]; 
            int j = i -1; 
 
            /*move elements of list[0..i-1], that 
             * greater that key, to one position ahead 
             of their current position*/ 
            while (j>=0 && list[j]> key) { 
                list[j+1] = list[j]; 
                j=j-1; 
 
            } 
            list[j+1] = key; 
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

