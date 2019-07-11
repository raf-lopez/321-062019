package threading;

import java.util.Random;

public class ThreadingBasics {
	public static void main(String[] args) {
		RandomNameThread t1 = new RandomNameThread();
		t1.start();
		RandomNumberThread t2 = new RandomNumberThread();
		t2.start();
	}
}

class RandomNameThread extends Thread {
	Random random = new Random();
	public void run() {
		String[] names = { "John", "Pete", "Mary", "Nick" };
		for (int i = 0; i < 100; i++) {
			int randomIndex = random.nextInt(4);
			System.out.println(names[randomIndex]);
		}
	}
}

class RandomNumberThread extends Thread {
	Random random = new Random();
	public void run() {
		for (int i = 0; i < 100; i++) {
			int randomNumber = random.nextInt(50);
			System.out.println(randomNumber);
		}
	}
}