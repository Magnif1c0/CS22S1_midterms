package sortingalgorithms;

public class ShellSort {
	 public void doShellSort(int list[]){ 
	        int n = list.length; 
	         
	        //Start with a big gap, then reduce the gap 
	        for(int gap = n/2; gap>0; gap/=2){ 
	            /*do a gapped insertion sort for this gap size. 
	             * the first gap element list[0..gap-1] are already 
	             * in gapped order keep adding one more element 
	             * until the entire array is gap sorted 
	             */ 
	            for(int i=gap; i<n;i+=1){ 
	                /*add list[i] to the elements that have been gap  
	                 * sorted save a[i] in temp and make a whole postion at  
	                 * position i 
	                 */ 
	                 
	                int temp = list[i]; 
	                 
	                //shift earlier gap-sorted elements up until 
	                //the correct location for a[i] is found 
	                int j; 
	                for (j = i; j >=gap && list[j-gap]>temp;j-=gap)  
	                    list[j] = list[j-gap]; 
	                     
	                    // put the temp(original list[i] in its correct location 
	                    list[j] = temp; 
	                 
	            } 
	        } 
	    } 
	 
	 
	} 
