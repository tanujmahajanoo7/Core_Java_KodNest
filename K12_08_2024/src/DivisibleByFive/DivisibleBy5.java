package DivisibleByFive;
public class DivisibleBy5 {
	void divisible(int num)
	{
		if(num%2==0 && num%5==0)
			System.out.println("Valid number");
		else
			System.out.println("Invalid number");
	}
}