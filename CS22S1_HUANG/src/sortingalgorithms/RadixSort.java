package sortingalgorithms;

import java.util.Arrays;

public class RadixSort {
	public static int getMax(int list [], int n){ 
        int mx = list[0]; 
        for (int i = 1; i < n; i++) 
            if (list[i] > mx) 
                mx = list[i]; 
        return mx; 
    } 
	public static void countSort(int list[], int n, int exp){
		int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0);
        
        for (i = 0; i < n; i++) 
            count[(list[i] / exp) % 10]++; 
 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
 
        for (i = n - 1; i >= 0; i--) { 
            output[count[(list[i] / exp) % 10] - 1] = list[i]; 
            count[(list[i] / exp) % 10]--; 
        } 
 
        for (i = 0; i < n; i++) 
            list[i] = output[i]; 
    } 
 
    public void radixSort(int[] list) { 
    }
	
    public void radixSort(int[] list, int n){ 
        int m = getMax(list, n); 
        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(list, n, exp); 
    } 
}
