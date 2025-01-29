package CustomisedException;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Main connection Establised");
		Bank bank = new Bank();
		bank.initiateATM();
		System.out.println("Main connection Terminated");
	}
}
