package PrimeRange;

import java.util.Scanner;

public class PrimmeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.close();
		
		Prime prime = new Prime();
		
		
		for(int i=num1;i<num2;i++)
		{
			if(prime.isprime(i))
				System.out.print(i + " ");			
		}

	}

}
