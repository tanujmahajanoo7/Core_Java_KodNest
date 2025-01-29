package CustomisedException;

public class Bank extends InvalidUserIdPasswordException {
	public void initiateATM() {
		ATM atm = new ATM();
		try {
			atm.withdraw();
		}
		catch(InvalidUserIdPasswordException e) {
			try {
				atm.withdraw();
			}
			catch(InvalidUserIdPasswordException e1) {
				try {
					atm.withdraw();
				}
				catch(InvalidUserIdPasswordException e2) {
					System.out.println("Card blocked");
				}
			}
		}
	}
}
