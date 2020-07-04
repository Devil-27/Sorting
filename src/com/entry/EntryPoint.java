
package com.entry;
import java.util.Scanner;

import com.bubbleSort.BubbleSort;
import com.insertionSort.InsertionSort;
import com.quickSort.*;
import com.selectionSort.SelectionSort;

public class EntryPoint 
{
	
	SelectionSort ss = new SelectionSort();
	
	BubbleSort bs = new BubbleSort();
	
	InsertionSort is = new InsertionSort();
	
	QuickSort qs = new QuickSort();
	
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[100];
	int n;
	
	public void input()
	{
		System.out.println("size of array: ");
		n = sc.nextInt();
		System.out.println("Enter the value: ");
	
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Which type of sorting you want to perform");
		System.out.println("1 for selection sort");
		System.out.println("2 for bubble sort");
		System.out.println("3 for insertion sort");
		System.out.println("4 for Quick sort");
		
		System.out.println("enter your choice: ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:ss.selectSort(arr,n );
			break;
			case 2:bs.bubble(arr,n);
			break;
			case 3:is.insertion(arr,n); 
			break;
			case 4: qs.quick();
			break;
		}
	}
		public static void main(String[] args)
		{
			EntryPoint ep = new EntryPoint();
			ep.input();
			
		}
	}

