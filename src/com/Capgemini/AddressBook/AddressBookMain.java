
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

			System.out.println("Choose Your Option (1/2/3/4):");
			System.out.println("1. Do you want to add NEW contact details in Address Book ? ");
			System.out.println("2. Do you want to edit EXISTING contact details in Address Book ? ");
			System.out.println("3. Don't Add Anything ");
			System.out.println("4. Delete an existing contact detail ?");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {

				System.out.println("Enter First Name");
				contObj.setFirstName(sc.nextLine());

				System.out.println("Enter Last Name");
				contObj.setLastName(sc.nextLine());

				System.out.println("Enter Address");
				contObj.setAddress(sc.nextLine());

				System.out.println("Enter City");
				contObj.setCity(sc.nextLine());

				System.out.println("Enter State");
				contObj.setState(sc.nextLine());

				System.out.println("Enter Email-ID");
				contObj.setEmail(sc.next());

				System.out.println("Enter Zip Code");
				contObj.setZip(sc.nextLong());

				System.out.println("Enter Phone No.");
				contObj.setPhoneNumber(sc.nextLong());

				ab.addDetails(contObj);
				System.out.println("Details Added Succesfully");
				ab.viewList();

				// System.out.println(contObj);

			} else if (choice == 2) {
				System.out.print("Enter First Name of the person whose contact you want to edit :");
				String fName = sc.nextLine();
				System.out.print("\n Enter Last Name of the person whose contact you want to edit :");
				String lName = sc.nextLine();
				System.out.println("Checking..................");
				String Name = fName + " " + lName;
				int pos = ab.checkPresence(fName, lName);
				if (pos <= ab.getListSize()) {
					System.out.println("You can edit the details for " + Name);
					System.out.println("Start Entering New Details :");

					//sc.nextLine();
					System.out.println("Enter First Name");
					contObj.setFirstName(sc.nextLine());

					System.out.println("Enter Last Name");
					contObj.setLastName(sc.nextLine());

					System.out.println("Enter Address");
					contObj.setAddress(sc.nextLine());

					System.out.println("Enter City");
					contObj.setCity(sc.nextLine());

					System.out.println("Enter State");
					contObj.setState(sc.nextLine());

					System.out.println("Enter Email-ID");
					contObj.setEmail(sc.next());

					System.out.println("Enter Zip Code");
					contObj.setZip(sc.nextLong());

					System.out.println("Enter Phone No.");
					contObj.setPhoneNumber(sc.nextLong());

					ab.editContact(pos, contObj);

				} else {
					System.out.println("No Such Entry Founded for " + fName + " " + lName + " !!");
				}
			} else if (choice == 3) {
				System.out.println("Thank you! You may exit now.");
				// System.exit(0);
				break;
			} 
				  else if (choice == 4) {
					  System.out.print("Enter First Name of the person whose contact you want to delete :");
					String f_delName = sc.nextLine();
					System.out.print("\n Enter Last Name of the person whose contact you want to delete :");
					String l_delName = sc.nextLine();
				  int pos =  ab.checkPresence(f_delName, l_delName);
				  if (pos <= ab.getListSize()) {
					  
					  System.out.println("Deleting Entry For "+f_delName+" "+l_delName+"......");
					  ab.deleteContact(pos);
					  System.out.println("Entry for "+f_delName+" "+l_delName+" deleted ");
					  ab.viewList();
				  }
				  else { System.out.println(" !!! Can't Delete, as no such entry founded !!!");
				   } 
				} 
				  else {
				System.out.println("Please enter a valid option.");
				continue;
			}
		}
	}
}
