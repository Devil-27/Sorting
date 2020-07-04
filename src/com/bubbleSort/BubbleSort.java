package com.bubbleSort;
public class BubbleSort {


	public void bubble(int []arr,int n)
	{
		
		System.out.println("***********BUBBLE SORT**************");
		System.out.println("unsorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		 for (int i = 0; i < n-1; i++) 
		 {
	            for (int j = 0; j < n-i-1; j++)
	            {
	                if (arr[j] > arr[j+1]) 
	                { 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                }
	            }
		 }
		
		System.out.println("*********sorted array: *************");
		for(int m=0;m<n;m++) 
		{
			System.out.println(arr[m]);
			
		}
		
		
	}

}
