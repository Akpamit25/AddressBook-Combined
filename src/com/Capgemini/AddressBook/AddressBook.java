package com.Capgemini.AddressBook;

import java.util.ArrayList;

import service.Contact;

public class AddressBook {

	ArrayList<Contact> contList = new ArrayList<Contact>(); // Using Array List

	public void addDetails(Contact obj) // Adding Details To List
	{
		contList.add(obj);
	}
	
	public void viewList()
	{
		System.out.println(contList);

	}

	public int getListSize() {
		return contList.size();
	}

	public int checkPresence(String fname, String lname) {
		int index = 0;
		int pos = 0;
		if (contList.size() != 0) {
			for (index = 0; index < contList.size(); index++) {

				if (contList.get(index).getFirstName().equalsIgnoreCase(fname)
						&& contList.get(index).getLastName().equalsIgnoreCase(lname)) {
					System.out.println("Entry For " + fname + " " + lname + " Founded !!");
					break;

				} else if (!(contList.get(index).getFirstName().equalsIgnoreCase(fname)
						|| contList.get(index).getLastName().equalsIgnoreCase(lname))) {
					pos++;
				}
			}
		} else {
			System.out.println("No Data Present");
		}
		return pos;

	}

	public void editContact(int pos, Contact obj1) {

		contList.set(pos, obj1);
		System.out.println("Details Edited !!! \n"+ contList);
	}

	public void deleteContact(int pos) {

		contList.remove(pos);
	}
}
