package FibonacciNumber;

public class FibonacciNumber {
	
	void fibo(int num)
	{
		int fN = 0;
		int sN = 1;
		
		if(num==1)
		{
			System.out.print(fN);
		}
		else if(num==2)
		{
			System.out.print(fN + " ");
			System.out.print(sN + " ");
		}
		else
		{
			int res = 0 ;
			System.out.print(fN + " ");
			System.out.print(sN + " ");
			for(int i=2;i<num;i++)
			{
				res = (fN + sN);
				System.out.print(res + " ");
				fN=sN;
				sN=res;				
			}			
		}
	}
}
