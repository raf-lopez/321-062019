import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// using conditions
		int grade = 68;
		if (grade > 70) {
			System.out.println("You passed!");
		} else {
			System.out.println("You failed :(");
		}
		
		// using loops - loop from 1 to 100
		for (int i = 0; i < 100; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();

		// using arrays to create lists
		String[] fruits = {"apple", "grapes", "melon", "lemon"};
		for (String fruit:fruits) {
			System.out.println("-" + fruit);
		}
		
		// getting input -- greeting the user, using a 
		// Scanner object
		System.out.print("What's your name? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Greetings, " + name + "!");
	}
}
