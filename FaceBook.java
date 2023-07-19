package exception;

import java.util.Scanner;

public class FaceBook {
	public static void main(String[] args)throws LoginException {
		Scanner sc=new Scanner(System.in);
		String userid=sc.next();
		System.out.println(userid);
		int psd=sc.nextInt();
		if(psd==12345) {
			System.out.println("Welcome Facebook..");
		}
		else {
			throw new LoginException("Password is Wrong");
		}
		
	}

}
