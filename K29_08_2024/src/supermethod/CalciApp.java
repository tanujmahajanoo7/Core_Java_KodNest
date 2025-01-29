package supermethod;
import java.util.Scanner;

class Calculator {
	String name = "Cisco";
	
	void addition() {
		System.out.println("Addition started");
	}
}

class MyCalculator extends Calculator {
	Scanner scan = new Scanner(System.in);
	String name = "Epson";
	
	void addition() {
		super.addition();
		
		System.out.println("Enter values of a and b");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Result is: " + (a+b));
	}
	
	void printname() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class CalciApp {

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		mc.addition();
		mc.printname();
	}
}
