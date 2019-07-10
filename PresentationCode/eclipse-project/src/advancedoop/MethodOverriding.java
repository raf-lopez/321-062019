package advancedoop;

public class MethodOverriding {

	public static void main(String[] args) {
		SalesEmployee se = new SalesEmployee();
		se.salary = 10_000;
		se.commission = 500;
		System.out.println(se.getSalary());

		Employee emp = new Employee();
		emp.salary = 10_000;
		System.out.println(emp.getSalary());
	}

}

class Person {
	String firstName;
	String lastName;
}

class Employee extends Person {
	int id;
	float salary;

	public float getSalary() {
		return salary;
	}
	
}

class SalesEmployee extends Employee {
	float commission;

	public float getSalary() {
		return salary + commission;
	}

}