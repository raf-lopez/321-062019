package advancedoop2;

import java.util.ArrayList;
import java.util.Iterator;

import advancedoop2.DatabaseOfEmployees.Employee;

public class Components {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class DatabaseOfEmployees implements Iterable<Employee> {
	class Employee { }
	ArrayList<Employee> employees = new ArrayList<Employee>();
	public DatabaseOfEmployees() {
		employees.add(new Employee());
	}
	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return employees.iterator();
	} 
}

class PhoneBook implements Iterable<String> {
	ArrayList<String> contacts = new ArrayList<String>();
	PhoneBook() {
		contacts.add("John");
		contacts.add("Peter");
		contacts.add("Pete");
	}
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return contacts.iterator();
	}

}
