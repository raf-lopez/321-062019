package essentialclasses;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("c:/321/output.txt");
		System.setOut(ps);

		String[] fruitsArray = 
			{"apple", "grapes", "lemon"};
		int[] numbersArray = new int[24];
		
		// please only store strings into this list
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("lemon");
		
		System.out.println(fruits);
		System.out.println("----");

		String second = fruits.get(1);
		System.out.println(second);
		System.out.println("----");
		

		for(String fruit:fruits) {
			String f = fruit;
			System.out.println(f);
		}
	}

}
