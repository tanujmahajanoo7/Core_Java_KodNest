package prime;

import java.util.Scanner;

public class PrimmeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		scan.close();
		Prime prime = new Prime();
		
		if(prime.isprime(num))
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");

	}

}
