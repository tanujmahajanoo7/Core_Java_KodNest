package PrimeRange;

public class Prime {
	public boolean isprime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
