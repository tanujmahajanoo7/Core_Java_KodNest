package Second_WayofExceptionHandling;

import java.util.Scanner;

public class ATM {
	void withdraw() throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
				
			System.out.println("Atm works and cash will dispenced id and only if you know division");
			System.out.println("Enter id and password for division");
			int id = sc.nextInt();
			int pwd = sc.nextInt();
			int res = id/pwd;
			System.out.println("Collect your res " + res +"rs Cash");
		}
		catch(Exception e) {
			System.out.println("Exception handled and issue handled");
//			e.printStackTrace();
			throw e;
		}
		finally {
			System.out.println("Connection to User database Terminated");			
		}
	}
}
