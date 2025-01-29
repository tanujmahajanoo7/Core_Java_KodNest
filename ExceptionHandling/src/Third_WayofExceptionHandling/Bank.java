package Third_WayofExceptionHandling;

public class Bank {
	void inititeATM() throws Exception{
		System.out.println("Connection to bank server Established");
		try {
			ATM atm = new ATM();
			atm.withdraw();			
		}
		finally {
			System.out.println("Connection to bank server Terminated");			
		}
	}
}
