package Calculator;

import java.util.Scanner;

public class AdvanceCalculator implements Calculator{
	Scanner scan = new Scanner(System.in);
	int a;
	int b;
	{
		System.out.println("Enter 2 number for Advance calculator");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	
	@Override
	public void add() {
		System.out.println("Addition result is " + (a+b));
	}

	@Override
	public void sub() {
		System.out.println("Addition result is " + (a-b));
	}

	@Override
	public void mul() {
		System.out.println("Addition result is " + (a*b));
	}

	@Override
	public void div() {
		System.out.println("Addition result is " + (a/b));
	}

	@Override
	public void mod() {
		System.out.println("Addition result is " + (a%b));
	}
}
