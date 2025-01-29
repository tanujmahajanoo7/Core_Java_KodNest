package K11_07_2024;

import java.util.Scanner;

public class evenNumberCount {

	public static void main(String[] args) {
		
		System.out.println("How many even numbers do you want me to print : ");
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int a=2;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			a=a+2;
		}
	}

}
