package com.kodnest.array.creation;

public class Array {
	private int arr[];
	public Array(int size) {
		arr = new int[size];
		System.out.println("Array of size " + size + " is created");
	}
	
	public void insert(int index,int element) {
		if(index>=0 && index<=arr.length-1) {
		arr[index]=element;
		}
	}
}
