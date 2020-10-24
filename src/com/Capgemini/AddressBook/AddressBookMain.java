package com.Capgemini.AddressBook;

import java.util.Scanner;
import service.Contact;

public class AddressBookMain {

	public static void main(String[] args) {
		Contact contObj = new Contact();

		System.out.println("Welcome To Address Book Management System");
		System.out.println("Do you want to add contact details in Address Book ? (Y/N)");

		Scanner sc = new Scanner(System.in);
		String choice = sc.next();

		if (choice.toUpperCase().charAt(0) == 'Y') {
			
			System.out.println("Enter First Name");
			contObj.setFirstName(sc.next());
			
			System.out.println("Enter Last Name");
			contObj.setLastName(sc.next());

			System.out.println("Enter Address");
			contObj.setAddress(sc.next());

			System.out.println("Enter City");
			contObj.setCity(sc.next());

			System.out.println("Enter State");
			contObj.setState(sc.next());

			System.out.println("Enter Email-ID");
			contObj.setEmail(sc.next());

			System.out.println("Enter Zip Code");
			contObj.setZip(sc.nextLong());

			System.out.println("Enter Phone No.");
			contObj.setPhoneNumber(sc.nextLong());
			
			sc.close();

		}
	}

}
