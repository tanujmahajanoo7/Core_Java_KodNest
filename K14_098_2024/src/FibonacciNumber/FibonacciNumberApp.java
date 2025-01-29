package FibonacciNumber;

import java.util.Scanner;

public class FibonacciNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		FibonacciNumber fn = new FibonacciNumber();
		fn.fibo(num);

	}

}
