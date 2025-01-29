package com.kodnest.sort.insert;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter no of element for an array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter element no " + (i+1) + " ");
			arr[i] = scan.nextInt();
		}
		
		InsertionSort s = new InsertionSort();
		s.insertionSort(arr);
		
		System.out.println("Sorted arry : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}	
		
		scan.close();
	}

}
