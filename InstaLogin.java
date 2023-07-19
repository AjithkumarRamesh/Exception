package exception;

public class InstaLogin{
	public static void main(String[] args)throws LoginException {
		String UserId="rohitajith@2702";
		System.out.println(UserId);
		String psd="Onesoft@123";
		if(psd.equals("Onesoft@123")) {
			System.out.println("Welcome");
		}
		else {
			throw new LoginException("Please enter Valid password");
		}
		int age=21;
		System.out.println(age);
	}

}
