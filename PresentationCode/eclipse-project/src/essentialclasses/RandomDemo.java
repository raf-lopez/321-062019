package essentialclasses;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"apple", "grapes", 
				"lemon", "strawberry" };
		Random random = new Random();

		String randomFruit = 
				fruits[random.nextInt(fruits.length)];
		System.out.println(randomFruit);
	}

}
