package EpsonCalculator;

import java.util.Scanner;

public abstract class Calculator {
	void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Remainder of " + a + " / " + b + " is " +(a%b));
	}
}
