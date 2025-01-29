package Calculator;

import java.util.Scanner;

public class ScientificCalculator implements Calculator {
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
		if(a==0 || b==0)
		{
			System.out.println("Do you really need addition ????????");
		}
		else
		{
			System.out.println("Addition result is " + (a+b));			
		}
	}

	@Override
	public void sub() {
		if(a==0 || b==0)
		{
			System.out.println("Do you really need subtration ????????");
		}
		else
		{
			System.out.println("Addition result is " + (a-b));
		}
	}

	@Override
	public void mul() {
		if(a==0 || b==0)
		{
			System.out.println("Do you really need multiplication ????????");
		}
		else
		{
			System.out.println("Addition result is " + (a*b));
		}
	}

	@Override
	public void div() {
		if(a==0 || b==0)
		{
			System.out.println("Do you really need division ????????");
		}
		else
		{
			System.out.println("Addition result is " + (a/b));
		}
	}

	@Override
	public void mod() {
		if(a==0 || b==0)
		{
			System.out.println("Do you really need addition ????????");
		}
		else
		{
			System.out.println("Addition result is " + (a%b));
		}
	}
}
