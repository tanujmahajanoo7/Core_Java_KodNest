package com.kodnest.search.binary;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of for array element");
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int temp = scan.nextInt();
			arr[i] = temp;
		}
		
		System.out.println("Enter element you want to search");
		int target = scan.nextInt();
		
		BinarySearch bs = new BinarySearch();
		int val = bs.binarySearch(arr,target);
		
		if(val==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index " + val);
		}
		scan.close();
	}
}
