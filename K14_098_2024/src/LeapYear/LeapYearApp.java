package LeapYear;

import java.util.Scanner;

public class LeapYearApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		LeapYear leapyear = new LeapYear();
		
		leapyear.lp(year);

	}

}
