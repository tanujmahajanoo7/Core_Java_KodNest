package com.kodnest.stack;

import java.util.Scanner;

public class StackApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the size of the stack: ");
     int size = scanner.nextInt();

     Stack stack = new Stack(size);

     while (true) {
         System.out.println("\nChoose an operation:");
         System.out.println("1. Push");
         System.out.println("2. Pop");
         System.out.println("3. Peek");
         System.out.println("4. Exit");
         System.out.print("Your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter a value to push: ");
                 int value = scanner.nextInt();
                 stack.push(value);
                 break;
             case 2:
                 stack.pop();
                 break;
             case 3:
                 int topValue = stack.peek();
                 if (topValue != -1) {
                     System.out.println("Top element: " + topValue);
                 }
                 break;
             case 4:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     }
 }
}
