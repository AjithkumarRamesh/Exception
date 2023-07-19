package exception;

public class Nullpoiinter {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String numberplate="TN01S3092";
		try {
			int a=Integer.parseInt(numberplate);
		}
		catch(ArithmeticException e) {
			System.out.println("Its is Arithmatic Exception");
		}
		catch(NullPointerException e) {
			System.out.println("Its is NullPointer exception");
		}
		catch(NumberFormatException e) {
			System.out.println("Its NumberFortmat Exception");
		}
		System.out.println("ThankYou.....");
			}

}
