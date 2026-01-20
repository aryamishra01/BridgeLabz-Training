package com.day12.addressbooksystem;

import java.util.List;
import java.util.Scanner;

public class AddressBookApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        int choice;

        do {
            System.out.println("\n===== DIGICONTACT ADDRESS BOOK =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City or State");
            System.out.println("5. Display All Contacts (Sorted)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();

                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    Address address = new Address(city, state, zip);
                    Contact contact = new Contact(fn, ln, phone, email, address);

                    if (book.addContact(contact)) {
                        System.out.println("Contact Added Successfully!");
                    } else {
                        System.out.println("Duplicate Contact Found. Not Added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Full Name to Edit: ");
                    String editName = sc.nextLine();

                    System.out.print("New Phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();

                    if (book.editContact(editName, newPhone, newEmail)) {
                        System.out.println("Contact Updated Successfully!");
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Full Name to Delete: ");
                    String delName = sc.nextLine();

                    if (book.deleteContact(delName)) {
                        System.out.println("Contact Deleted Successfully!");
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter City or State: ");
                    String search = sc.nextLine();

                    List<Contact> found = book.searchByCityOrState(search);

                    if (found.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        for (Contact c : found) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 5:
                    if (book.isEmpty()) {
                        System.out.println("Address Book is Empty.");
                    } else {
                        for (Contact c : book.getSortedContacts()) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thank you for using DigiContact!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

