package com.kodnest.sort.selection;

public class SelectionSort {
	public void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int smin = arr[i];
			int pos = i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<smin) {
					smin = arr[j];
					pos = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}
}
