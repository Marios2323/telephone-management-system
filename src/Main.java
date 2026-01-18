import books.PhoneBook;
import contacts.Contact;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Tester", "+306999999999", "test1@gmail.com");
        Contact contact2 = new Contact("Developer", "+306988888888", "test2@gmail.com");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.listContacts();

        phoneBook.addContact(contact2);
        phoneBook.listContacts();

        System.out.println("Contact with the name: " + phoneBook.findContact("Tester").getName()
                + " exists? " + phoneBook.removeContact("Tester"));
        phoneBook.listContacts();
        System.out.println(phoneBook.findContact("Panos"));
        Contact found = phoneBook.findContact("Panos");

        if (found != null) {
            System.out.println(found.getName());
        }
    }
}