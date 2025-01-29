package EpsonCalculator;

import java.util.Scanner;

public abstract class ScientificCalculator extends Calculator implements Calculator1,Calculator2{

	@Override
	public void mul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Product of " + a + " & " + b + " is " +(a*b));
	}

	@Override
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Addition of " + a + " & " + b + " is " +(a+b));
		
	}

	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Subtraction of " + a + " & " + b + " is " +(a-b));
	}
}
