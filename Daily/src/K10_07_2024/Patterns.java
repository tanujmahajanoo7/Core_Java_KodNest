package K10_07_2024;

public class Patterns {

	public static void main(String[] args) 
	{			
		System.out.println("--------------------30--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------31--------------------");
				
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || j==0)
				{
					System.out.print("* ");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------32--------------------");
		
		int n=11;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==(n-1)/2 || i==n-1)
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------33--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || i==10 || j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------34--------------------");

		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || i==10 || j==5 || j==0 || j==10)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("--------------------35--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || i==10 || j==5 || j==0 || j==10 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("--------------------36--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || i==10 || j==5 || j==0 || j==10 || i==j || (i+j)==10)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------37--------------------");

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==(n-1)/2 || i==(n-1) || j==(n-1)/2 || j==0 || j==(n-1) || i==j || (i+j)==(n-1) || (i+j)==(n-1)/2 || (j-i)==(n-1)/2 || (i-j)==(n-1)/2 || (i+j)==((3*n)-2)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------38--------------------");
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==(n-1) || j==0 || j==(n-1) || (i+j)==(n-1)/2 || (j-i)==(n-1)/2 || (i-j)==(n-1)/2 || (i+j)==((3*n)-2)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------H.W	.--------------------");
		System.out.println("--------------------39--------------------");

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==(n-1)/2 || j==0 || j==(n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("--------------------40--------------------");

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==(n-1)/2 || j==0 || j==(n-1) || i==(n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------41--------------------");

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || j==0 || i==(n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------42--------------------");

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || j==0 || i==(n-1) || j==(n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------43A--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || j==0 || j==10)
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


		System.out.println("--------------------44B--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || j==0 || j==10 || i==10)
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

		System.out.println("--------------------45C--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || j==0 || i==10)
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

		System.out.println("--------------------46D--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || j==0 || i==10 || j==10 )
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

		System.out.println("--------------------47E--------------------");

		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || j==0 || i==10)
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
		
		System.out.println("--------------------48F--------------------");
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i==5 || j==0 || i==(n-1)/2)
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

		System.out.println("--------------------49G--------------------");

		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || j==0 || i==(n-1))
				{
					System.out.print("* ");
				}
				else if(j==(n-1))
				{
					if(i>(n-1)/2)
					{
						System.out.print("* ");
					}
				}
				else if(i==(n-1)/2)
				{
					if(j>=((n-1)/2) || j==n)
					{
						System.out.print("$ ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------50H--------------------");


		System.out.println("--------------------51I--------------------");


		System.out.println("--------------------52J--------------------");


		System.out.println("--------------------53K--------------------");


		System.out.println("--------------------54L--------------------");


		System.out.println("--------------------55M--------------------");


		System.out.println("--------------------56N--------------------");


		System.out.println("--------------------57O--------------------");


		System.out.println("--------------------58P--------------------");


		System.out.println("--------------------59Q--------------------");


		System.out.println("--------------------60R--------------------");


		System.out.println("--------------------61S--------------------");


		System.out.println("--------------------62T--------------------");


		System.out.println("--------------------63U--------------------");


		System.out.println("--------------------64V--------------------");


		System.out.println("--------------------65W--------------------");


		System.out.println("--------------------66X--------------------");


		System.out.println("--------------------67Y--------------------");


		System.out.println("--------------------68Z--------------------");



		


	}
}



















