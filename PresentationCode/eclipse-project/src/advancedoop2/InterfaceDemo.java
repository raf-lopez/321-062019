package advancedoop2;

import java.util.ArrayList;
import java.util.Iterator;

public class InterfaceDemo {
	public static void main(String[] args) {
		Iterable iterable = new DatabaseOfEmployees();
		for (Object name : iterable) {
			System.out.println(name);
		}
	}
}

class Person {
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
