package com.kodnest.stack;

//Stack.java

public class Stack {
	 private int[] stack;
	 private int top;
	 private int maxSize;

	 // Constructor to initialize the stack
	 public Stack(int size) {
	     maxSize = size;
	     stack = new int[maxSize];
	     top = -1;
	 }
	
	 // Push method to add element to the stack
	 public void push(int value) {
	     if (top == maxSize - 1) {
	         System.out.println("Stack is full. Cannot push " + value);
	     } 
	     else {
	         stack[++top] = value;
	         System.out.println("Pushed " + value);
	     }
	 }
	
	 // Pop method to remove element from the stack
	 public int pop() {
	     if (top == -1) {
	         System.out.println("Stack is empty. Cannot pop.");
	         return -1;
	     } 
	     else {
	         int value = stack[top--];
	         System.out.println("Popped " + value);
	         return value;
	     }
	 }
	
	 // Method to check the top element of the stack
	 public int peek() {
	     if (top == -1) {
	         System.out.println("Stack is empty.");
	         return -1;
	     } 
	     else {
	         return stack[top];
	     }
	 }
}
