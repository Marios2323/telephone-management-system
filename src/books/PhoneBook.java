package books;

import contacts.Contact;
import exceptions.EmptyContactListException;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean removeContact(String name) {
        return contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public Contact findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void listContacts() {
        if (contacts.isEmpty()) throw new EmptyContactListException("Contact list is empty");
        int contactCounter = 1;
        for (Contact contact : contacts) {
            System.out.println(contactCounter + "\nContact name: " + contact.getName() +
                    "\nContact phone number: " + contact.getPhoneNumber() +
                    "\nContact E-mail: " + contact.getEmail());
            contactCounter++;
        }
        System.out.println("**************************************");
    }

    public boolean containsContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}