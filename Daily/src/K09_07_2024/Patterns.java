package K09_07_2024;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------16--------------------");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j>3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("$");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------17--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("$");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------18--------------------");
		
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<6;j++)
			{
				if(n>j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			n-=1;
			System.out.println();
		}
		
		System.out.println("--------------------19--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------20--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------21--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------22--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------23--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------24--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------25--------------------");

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------26--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------27--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------28--------------------");

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			}
			System.out.println();
		}
		
		System.out.println("--------------------29--------------------");
		
		for(int i=1;i<=5;i++)
		{
			 for (int j = 5; j >= i; j--) 
			 {
                System.out.print(" ");
	         }
			 for(int k=1;k<=i;k++)
			 {
				 if(i==1 || i==5 || k==i || k==1)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
			 }    
			System.out.println();
		}
	}
}
