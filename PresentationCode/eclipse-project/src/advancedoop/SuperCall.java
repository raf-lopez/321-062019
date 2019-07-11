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

// dlairesales@gmail.com
class Subclass extends Superclass{
	Subclass() {
		super(1111);
		System.out.println("Subclass");
	}
}


