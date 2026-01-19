package contacts;

import exceptions.EmptyEmailException;
import exceptions.EmptyNameException;
import exceptions.EmptyPhoneException;

public class Contact {
    private final String name;
    private final String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        if (name == null || name.isEmpty()) throw new EmptyNameException("Name cannot be empty");
        this.name = name;
        if (phoneNumber == null || phoneNumber.isEmpty()) throw new EmptyPhoneException("Phone number cannot be empty");
        this.phoneNumber = phoneNumber;
        if (email == null || email.isEmpty()) throw new EmptyEmailException("Email cannot be empty");
        this.email = email;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setEmail(String email) {
        if (email == null || email.isEmpty())
            throw new EmptyEmailException("Email cannot be empty");
        this.email = email;
    }
}