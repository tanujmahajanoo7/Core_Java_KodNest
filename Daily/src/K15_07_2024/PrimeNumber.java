//Write a java program to check whether a given number is prime number or not
package K15_07_2024;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		boolean val=true;
		
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not prime");
				val=false;
				break;
			}	
		}
		
		if(val==true)
		{
			System.out.println("Number is prime");			
		}
	}

}
