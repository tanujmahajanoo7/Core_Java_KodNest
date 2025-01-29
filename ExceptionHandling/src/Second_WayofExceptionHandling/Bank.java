package Second_WayofExceptionHandling;

public class Bank {
	void inititeATM() {
		System.out.println("Connection to bank server Established");
		try {
			ATM atm = new ATM();
			atm.withdraw();			
		}
		catch(Exception e) {
			System.out.println("Exception from atm rached bank");
		}
		System.out.println("Connection to bank server Terminated");
	}
}
