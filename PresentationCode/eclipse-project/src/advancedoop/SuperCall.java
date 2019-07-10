package advancedoop;

public class SuperCall {

	public static void main(String[] args) {
		Subclass subclass = new Subclass();
	}

}


class Superclass {
	Superclass(int i) {
		System.out.println("Superclass");
	}
}

class Subclass extends Superclass{
	Subclass() {
		super();
		System.out.println("Subclass");
	}
}


