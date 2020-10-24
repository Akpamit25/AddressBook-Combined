package com.Capgemini.AddressBook;

import java.util.ArrayList;

import service.Contact;

public class AddressBook {
	static int count = 0;

	ArrayList<Contact> contList = new ArrayList<Contact>(); // Using Array List

	public void addDetails(Contact obj) // Adding Details To List
	{
		contList.add(obj);
		System.out.println(contList);
	}

	public String checkPresence(String fname, String lname) {
		String s = " ";

		for (int index = 0; index < contList.size(); index++) {

			if (contList.get(index).getFirstName().equalsIgnoreCase(fname)
					&& contList.get(index).getLastName().equalsIgnoreCase(lname)) {
				s = "Founded";
				System.out.println("Entry For " + fname + " " + lname + " Founded !!");
				break;

			} else if (!(contList.get(index).getFirstName().equalsIgnoreCase(fname)
					|| contList.get(index).getLastName().equalsIgnoreCase(lname))) {
				s = "Not Founded";
				System.out.println("No Such Entry Founded for " + fname + " " + lname + " !!");
				break;
			}
			count++;
		}
		return s;
	}

	public void editContact(Contact obj1) {

		contList.set(count, obj1);
		System.out.println(contList);
	}
}
