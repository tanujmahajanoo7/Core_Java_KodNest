package com.kodnest.sort.selection;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter no of element for an array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter element no " + (i+1) + " ");
			arr[i] = scan.nextInt();
		}
		
		SelectionSort s = new SelectionSort();
		s.selectionSort(arr);
		
		System.out.println("Sorted arry : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}	
		
		scan.close();
	}

}
