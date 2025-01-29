package PathHandler;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Demo1 d1 = new Demo1();
		d1.call1(num1, num2);
	}
}
