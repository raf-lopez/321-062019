package essentialclasses;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		System.out.println("Processing...");
		long start = System.currentTimeMillis();
		// String initial = "hello";
		StringBuilder initial = new StringBuilder("hello");
		
		// concatenate 100,000 times
		for (int i = 0; i < 100000; i++) {
			initial.append(" world");
		}
		long end = System.currentTimeMillis();
		long duration = end - start;

		System.out.println("Operation took "
				+ duration + " milliseconds!");
	}

}
