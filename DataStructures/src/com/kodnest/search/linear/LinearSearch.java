package com.kodnest.search.linear;

public class LinearSearch {
	public int linearSearch(int arr[], int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
