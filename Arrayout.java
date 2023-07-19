package exception;

public class Arrayout {
	public static void main(String[] args) {
		System.out.println("Welcome...");
		String x="hello";
		System.out.println(x.indexOf('O'));
		int []a= {10,20,30,40};
		try {
			System.out.println(a[6]);
		}
		catch(ArithmeticException e) {
			System.out.println("YYYY");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please do valid input");
		}
		finally {
			System.out.println("Thank You for using as....");
		}
		System.out.println("thank You.....");
		
	}

}
