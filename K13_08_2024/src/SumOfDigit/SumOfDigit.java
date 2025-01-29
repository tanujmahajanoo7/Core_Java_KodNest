package SumOfDigit;

public class SumOfDigit {
	public int sd(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int lastdigit = num % 10 ;
			sum += lastdigit;
			num/=10;
		}
		return sum;
	}
}
