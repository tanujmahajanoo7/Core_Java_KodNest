package com.kodnest.search.linear;

import java.util.Scanner;

public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of element: ");
		int n = scan.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+  (i+1) + " element");
			int temp = scan.nextInt();
			arr[i]=temp;
		}
		
		System.out.println("Enter key you want to search");
		int key = scan.nextInt();
		
		LinearSearch ls = new LinearSearch();
		int val = ls.linearSearch(arr, key);
		
		if(val==-1) {
			System.out.println("Key is not found");
		}
		else {
			System.out.println("Key is found at index " + (val+1));
		}
		scan.close();
	}
}