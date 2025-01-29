package PrimeLessThan20;

import java.util.Scanner;

public class PrimmeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
		
		scan.close();
		
		Prime prime = new Prime();
		
		int res=0;
		for(int i=1;i<90;i++)
		{
			if(prime.isprime(i))
			{
				if((i/2)<25)
				{
					System.out.print(i + " ");
				}
//				res += i;
//				if(res<20)
//				{
//					if(res*res<169)
//						System.out.print(res + " ");
//				}
								
			}
		}

	}

}
