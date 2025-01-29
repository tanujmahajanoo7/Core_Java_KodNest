//Write a java program to print all the prime numbers in a given range
package K15_07_2024;

import java.util.Scanner;

public class PrimeNumberRange 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
//		int n1=1,n2=20;
		for(int i=n1;i<n2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					System.out.print("");
					break;
				}
				else
				{
					System.out.print(i+" ");
					break;
				}
			}
		}
		
	}
}
