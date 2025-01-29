package com.kodnest.sort.bubble;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements in array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element no " + (i+1) + " ");
			arr[i]=scan.nextInt();
		}
		BubbleSort b = new BubbleSort();
		b.bubbleSort(arr);
		
		System.out.println("Sorted Array:");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
