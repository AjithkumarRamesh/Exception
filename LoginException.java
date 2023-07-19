package exception;

public class LoginException extends Exception {
	public LoginException(String psw) {
		super(psw);
	}

}
