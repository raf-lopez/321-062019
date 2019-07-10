package advancedoop2;

public class AbstractClasses {

	public static void main(String[] args) {
		SalesEmployee emp = new SalesEmployee("John");
	}

}

abstract class Employee {
	String name;
	Employee(String name) {
		this.name = name;
	}
	abstract float getPay();
}

class SalesEmployee extends Employee {
	SalesEmployee(String name) {
		super(name);
	}

	@Override
	float getPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
