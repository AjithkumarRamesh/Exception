package exception;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a=10;
		int b=5;
		int c=0;
		System.out.println(a+b+c);
		try {
			System.out.println(a/c);
		}
		catch (ArithmeticException  e) {
			System.out.println("Hey exception");
			
		}
		catch (Exception e) {
			System.out.println("Hey.....do not divible by 0 any number");
			
		}
		
		System.out.println(a*b);
		System.out.println("Thank You");
	}

}
