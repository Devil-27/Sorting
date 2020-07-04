package com.selectionSort;

public class SelectionSort 
{
	
	public void selectSort(int []arr, int n )
	{
		
		System.out.println("	***********SELECTION SORT**************		");
		System.out.println(n);
		for (int i = 0; i < n-1; i++) 
		{ 
		  
		    int min = i; 
		    
		    for (int j = i+1; j < n; j++) 
		        if (arr[j] < arr[min]) 
		            min = j; 

		    
		    int temp = arr[min]; 
		    arr[min] = arr[i]; 
		    arr[i] = temp; 
		} 
		
			System.out.println("*********sorted array: *************");
			for(int m=0;m<n;m++) 
			{
				System.out.println(arr[m]);
				
			}
		}	
	}
