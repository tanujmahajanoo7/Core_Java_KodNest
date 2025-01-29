package K11_07_2024;

import java.util.Scanner;

public class SquareNumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many odd number Sum you need : ");
		int n = scan.nextInt();
		int count=0;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i + " ");
			sum+=(i*i);
		}
		System.out.println();
		System.out.println("Sum of square of first "+n+" natural number is : " +sum );

	}

}
