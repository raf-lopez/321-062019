package codesimplification;

import java.util.Random;

public class ShorteningCode {
	public static void main(String[] args) {
		// anonymous inner class
		Thread t1 = new Thread() {
			Random random = new Random();

			public void run() {
				String[] names = { "John", "Pete", "Mary", "Nick" };
				for (int i = 0; i < 100; i++) {
					int randomIndex = random.nextInt(4);
					System.out.println(names[randomIndex]);
				}
			}
			
		};
		t1.start();

		Random random = new Random();
		
		Runnable t2 = ()->{
			for (int i = 0; i < 100; i++) {
				int randomNumber = random.nextInt(50);
				System.out.println(randomNumber);
			}
		};

		new Thread(()->{
			for (int i = 0; i < 100; i++) {
				int randomNumber = random.nextInt(50);
				System.out.println(randomNumber);
			}
		};
).start();
	}

}

