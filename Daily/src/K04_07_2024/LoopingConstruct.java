package K04_07_2024;

import java.util.Scanner;

public class LoopingConstruct 
{

	public static void main(String[] args) 
	{
//		int i=1;
//		while(i<=5)
//		{
//			System.out.println("KodNest");
//			System.out.println(i);
//			i++;
//		}
//		
//		i=1;
//		do 
//		{
//			System.out.println("Kodnest");
//			i++;
//		}while(i<=5);
		
		
		
		//Infinte Looping
//		for( ; ; )
//		{
//			System.out.println("Kodnest!");
//		}

//		while(true)
//		{
//			System.out.println("Kodnest!");
//		}

//		do
//		{
//			System.out.println("Kodnest!");
//		}while(true);

//		for(int i=0,j=0;i<=5 && j<=5;i++,j++)
//		{
//			System.out.println("Value of i:"+i+" Value of j:"+j);
//		}
		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<=5;j++)
//			{
//				System.out.println("KodNest");
//			}
//			System.out.println("-------------------");
//		}
		
//		int j=1;
//		while(j<=5)
//		{
//			int a=0;
//			while(a<=5)
//			{
//				System.out.println("Kodnest");
//				a++;
//			}
//			System.err.println("----------------------");
//			j++;
//		}
		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Kodnest");
//			if(i==3)
//			{
//				break;
//			}
//		}
		
		Scanner scna = new Scanner(System.in);
		System.out.println("Enter a number less than 20");
		int n=scna.nextInt();
		while(true)
		{
			n++;
			System.out.println(n);
			if(n==20)
			{
				break;
			}
		}	
	}

}
