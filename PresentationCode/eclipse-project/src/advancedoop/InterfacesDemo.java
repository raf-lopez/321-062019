package advancedoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class InterfacesDemo {
	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.firstName = "Joe";
		System.out.println(contact);
	}
}

class Contact {
	String firstName;
	
	public String toString() {
		return this.firstName;
	}
}



