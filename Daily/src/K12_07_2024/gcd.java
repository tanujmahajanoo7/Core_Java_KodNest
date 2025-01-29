//Write a java program to find the gcd of two numbers

package K12_07_2024;

import java.util.Scanner;

public class gcd {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int m,n,rem=0;
		
		System.err.println("Enter 2 number for gcd");
		
		m=scan.nextInt();
		n=scan.nextInt();
		
		while(n!=0)
		{			
			rem=m%n;
			m=n;
			n=rem;
		}
		System.out.println(m);
	}
}
