package Third_WayofExceptionHandling;

public class BankApp {
	public static void main(String[] args) throws Exception{
		System.out.println("Main connection Established");
		try {
			Bank bank = new Bank();
			bank.inititeATM();			
		}
		finally {
			System.out.println("Main connection Terminated");			
		}
	}
}
