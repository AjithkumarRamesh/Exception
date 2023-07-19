package exception;

public class NullPointerExceptions {
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Exception try catch....");
		String name=null;
		try {
			System.out.println(name.toUpperCase());
		}
		catch (ArithmeticException e) {
			System.out.println("Arithimatic Exception....");
		}
	
		catch(NullPointerException npe) {
			System.out.println(npe);
			npe.printStackTrace();
			System.out.println("Name will be Null Please Enter the Name...");
		}
		
		System.out.println("ThankYou...");
	}
}
