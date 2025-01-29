package PractiseProblems;

import java.util.Scanner;

public class DataTypesOperator {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int add = a+b;
		System.out.println("Addition of your 2 number is  = " + add);
		int sub = a-b;
		System.out.println("Subtraction of your 2 number is = " + sub);
		int mul = a*b;
		System.out.println("Multiplication of your 2 numebr is = " + mul);
		int div = a/b;
		System.out.println("Division of your 2 number is = " + div);
	}	
}
