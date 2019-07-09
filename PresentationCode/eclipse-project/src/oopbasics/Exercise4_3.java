package oopbasics;

import java.util.Scanner;

public class Exercise4_3 {

	public static void main(String[] args) {
		System.out.print("Enter a single character (0-9): ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if (input.length() > 1) {
			System.out.println("Please enter 1 character only");
		} else {
			// get the first character from the string
			char character = input.charAt(0);
			boolean isDigit = Character.isDigit(character);
			if (isDigit == true) {
				System.out.println("Thanks!");
			} else {
				System.out.println("Oops. Not a digit!");
			}
		}
		
	}

}
