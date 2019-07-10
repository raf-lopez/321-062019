package ownclasses;

import java.util.Calendar;
import java.util.Date;

public class DesigningClasses {
	public static void main(String[] args) {
		Contact john = new Contact();
//		john.firstName = "John";
		john.setFirstName("John");
		john.lastName = "Cruz";
		john.email = "john@gmail.com";
		john.phoneNum = "555-22-33";
		Calendar johnBirthday = Calendar.getInstance();
		johnBirthday.set(1990, Calendar.APRIL, 24);
		john.birthday = johnBirthday;
		System.out.println(john.firstName);
		System.out.println(john.getFirstName());
		String fn = john.getFullName();
		System.out.println(fn);

		Contact mary = new Contact();
		mary.firstName = "Mary";
		mary.lastName = "Amparo";
		mary.email = "mary.amparo@gmail.com";
		mary.phoneNum = "555-21-33";
		
		System.out.println(mary.getFullName());
		Contact newContact = Contact.getInstance();
		
		System.out.println(john.getAge());
	}
}

class Contact {
	String firstName;
	String lastName;
	String email = "<n/a>";
	String phoneNum;
	Calendar birthday;

	int getAge() {
		Calendar today = Calendar.getInstance();
		long ageInMsecs = today.getTimeInMillis() - this.birthday.getTimeInMillis();
		int result = (int)(ageInMsecs/1000L/60/60/24/365);
		return result;
	}

	static Contact getInstance() {
		return new Contact();
	}
	
	String getFullName() {
		return firstName + " " + lastName;
	}
	
	// getter for firstName
	String getFirstName() {
		return firstName;
	}
	
	void setFirstName(String newName) {
		if (newName.equals("")) {
			throw new IllegalArgumentException();
		}
		firstName = newName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Calendar getBirthday() {
		return birthday;
	}
	
	
	
}
