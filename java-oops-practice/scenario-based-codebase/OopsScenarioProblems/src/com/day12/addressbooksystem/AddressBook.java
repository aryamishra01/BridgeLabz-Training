package com.day12.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate check
    public boolean addContact(Contact contact) {

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                return false; // duplicate
            }
        }

        contacts.add(contact);
        return true;
    }

    // Edit phone and email by name
    public boolean editContact(String name, String newPhone, String newEmail) {

        for (Contact c : contacts) {
            if (c.hasSameName(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }

    // Delete contact by name
    public boolean deleteContact(String name) {

        for (Contact c : contacts) {
            if (c.hasSameName(name)) {
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }

    // Search by city or state
    public List<Contact> searchByCityOrState(String value) {

        List<Contact> result = new ArrayList<>();

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value)
                    || c.getAddress().getState().equalsIgnoreCase(value)) {
                result.add(c);
            }
        }
        return result;
    }

    // Display all contacts sorted by full name
    public List<Contact> getSortedContacts() {

        List<Contact> sortedList = new ArrayList<>(contacts);

        Collections.sort(sortedList, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getFullName().compareToIgnoreCase(c2.getFullName());
            }
        });

        return sortedList;
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }
}

