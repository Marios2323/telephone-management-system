package books;

import contacts.Contact;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PhoneBookTest {
    @Test
    public void shouldContainContactAfterAddingIt() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("TestName", "TestPhoneNumber", "TestEmail");
        phoneBook.addContact(contact);
        assertTrue(phoneBook.containsContact("TestName"));
    }

    @Test
    public void shouldNotContainContactWhenNotAdded() {
        PhoneBook phoneBook = new PhoneBook();

        assertFalse(phoneBook.containsContact("NoName"));
    }

    @Test
    public void shouldNotContainEmptyContactName() {
        PhoneBook phoneBook = new PhoneBook();
        assertFalse(phoneBook.containsContact(""));
    }
}