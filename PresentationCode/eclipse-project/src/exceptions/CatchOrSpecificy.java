package exceptions;

public class CatchOrSpecificy {

	public static void main(String[] args) {
	}

	public static void run() {
		// InterruptedException
		// Thread.sleep(100000);

		// ArrayIndexOutOfBoundsException
		String[] names = {"apple", "grapes"};
		System.out.println(names[123000]);
	}
}
