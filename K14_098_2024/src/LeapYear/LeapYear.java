package LeapYear;

public class LeapYear {
	void lp(int year)
	{
		if(year%4==0 && year%100!=0)
		{
			System.out.println("Leap Year");
		}
		else if(year%400==0)
		{
			System.out.println("Leap Year");			
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}
