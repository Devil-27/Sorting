package com.insertionSort;
public class InsertionSort {

	public void insertion(int []arr , int n) 
	{
		System.out.println("************INSERTION SORT******************");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i = 1; i < n; ++i)
		{ 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) 
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
		
		System.out.println("*********sorted array: *************");
		for(int m=0;m<n;m++) 
		{
			System.out.println(arr[m]);
			
		}
		
	}


	
}
