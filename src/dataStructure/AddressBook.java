package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}
