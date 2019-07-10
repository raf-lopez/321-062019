package advancedoop2;

import java.util.ArrayList;
import java.util.Iterator;

public class InterfaceDemo {

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		for (String name : phoneBook) {
			System.out.println(name);
		}
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