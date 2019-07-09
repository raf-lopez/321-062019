import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		// getting input -- greeting the user, using a 
		// Scanner object
		System.out.print("What's your name? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Greetings, " + name + "!");
	}
	
}