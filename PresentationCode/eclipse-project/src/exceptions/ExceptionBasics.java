package exceptions;

public class ExceptionBasics {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero!!!!");
		}
		System.out.println("END");
	}

}
