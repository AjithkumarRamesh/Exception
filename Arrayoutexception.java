package exception;

public class Arrayoutexception {
	public static void main(String[] args) {
		String []name= {"Ajith","Kumar","Gokul"};
		System.out.println("Welcome");
	
		try {
		System.out.println(name[4]);
	}
		catch(ArithmeticException e) {
			System.out.println("Dont do Arithmetic Excepion");
		}
		catch (NullPointerException e) {
			System.out.println("Dont do NullPointerException");
		}
		catch (NumberFormatException e) {
			System.out.println("Dont do NumberFormatException");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Your Index Position is Not correct..please try correct position");
		}
		String a="Ajith";
		try {
		System.out.println(a.charAt(8));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Thank you.....Visit Again...");
	}

}
