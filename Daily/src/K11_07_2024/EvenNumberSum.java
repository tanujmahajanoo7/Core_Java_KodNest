package K11_07_2024;

import java.util.Scanner;

public class EvenNumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many even number Sum you need : ");
		int n = scan.nextInt();
		
		int a=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a+=2;
			sum+=a;
		}
		System.out.print("Sum of first "+n+" even number is : " + sum);
		
	}

}
