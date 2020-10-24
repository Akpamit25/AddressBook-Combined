package com.Capgemini.AddressBook;

import java.util.*;
import service.Contact;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		System.out.println("Welcome To Address Book Management System");

		while (true) {
			Contact contObj = new Contact();

			System.out.println("Choose Your Option (1/2/3):");
			System.out.println("1. Do you want to add NEW contact details in Address Book ? (Y/N)");
			System.out.println("2. Do you want to edit EXISTING contact details in Address Book ? (Y/N)");
			System.out.println("3. Don't Add Anything ");

			int choice = sc.nextInt();

			if (choice == 1) {

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

				ab.addDetails(contObj);
				System.out.println("Details Added Succesfully");

				// System.out.println(contObj);

			} else if (choice == 2) {
				System.out.println("Enter First Name & Last Name of the person whose contact you want to edit");
				String fName = sc.next();
				String lName = sc.next();
				System.out.println("Checking..................");
				String Name = fName + " " + lName;
				String status = ab.checkPresence(fName, lName);
				if (status.equals("Founded")) {
					System.out.println("You can edit the details for " + Name);
					System.out.println("Start Entering New Details :");

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

					ab.editContact(contObj);

				}
			} else if (choice == 3) {
				System.out.println("Thank you! You may exit now.");
				System.exit(0);
			} else {
				System.out.println("Please enter a valid option.");
				continue;
			}
		}

	}
}
