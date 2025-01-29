package CustomisedException;

public class InvalidUserIdPasswordException extends Exception {
	public String getMessage() {
		return "Enter valid UserId and Password";
	}
}
