package K11_07_2024;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many odd number Sum you need : ");
		int n = scan.nextInt();
		
		int a=-1;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a+=2;
			sum+=a;
		}
		System.out.print("Sum of first "+n+" odd number is : " + sum);

	}

}

