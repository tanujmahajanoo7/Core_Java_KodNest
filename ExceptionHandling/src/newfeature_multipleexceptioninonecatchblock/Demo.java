package newfeature_multipleexceptioninonecatchblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int c = num1 / num2;
			System.out.println(c);
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
