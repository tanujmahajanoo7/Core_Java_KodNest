//Write a java program to print all the factors of given number
package K15_07_2024;

import java.util.Scanner;

public class AllPossibleFactors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				int fact =num/i;
				System.out.print(fact+" "+i);
				break;
			}
		}
	}
}
