package Second_WayofExceptionHandling;

public class BankApp {
	public static void main(String[] args) {
		System.out.println("Main connection Established");
		Bank bank = new Bank();
		bank.inititeATM();
		System.out.println("Main connection Terminated");
	}
}
