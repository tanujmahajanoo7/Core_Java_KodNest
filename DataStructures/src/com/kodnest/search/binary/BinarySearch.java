package com.kodnest.search.binary;

public class BinarySearch {
	public int binarySearch(int arr[], int target) {
		
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid = s + (e-s)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return -1;
	}
}
