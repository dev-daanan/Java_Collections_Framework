package Projects.Project1_ContactManagementSystem.src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static Utilities.InputHandling.*;

public class ContactManager {
    private final ArrayList<Contact> contactArrayList;
    private final HashMap<String, Contact> contactHashMap;

    public ContactManager(ArrayList<Contact> contactArrayList, HashMap<String, Contact> contactHashMap) {
        this.contactArrayList = contactArrayList;
        this.contactHashMap = contactHashMap;
    }
    public ContactManager() {
        this(new ArrayList<>(), new HashMap<>());
    }

    public HashMap<String, Contact> getContactHashMap() {
        return contactHashMap;
    }

    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public Contact searchByName(String name) {
        return contactHashMap.get(name);
    }

    public Contact searchByEmail(String email) {
        for (Contact contact : contactArrayList) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                return contact;
            }
        }
        return null;
    }

    public void addContact(Contact contact) {
        contactArrayList.add(contact);
        contactHashMap.put(contact.getName(), contact);
    }

    public void addContact() {
        addContact(new Contact(getNameInput(), getEmailInput(), getPhoneNumberInput()));
    }

    public void addContact(String name, String email, String phoneNumber) {
        addContact(new Contact(name, email, phoneNumber));

    }

    public void sortAlphabetically() {
        Collections.sort(contactArrayList);
    }

    public void printContacts() {
        for (
                Contact contact : contactArrayList) {
            System.out.println(contact.getName());
        }
    }

    public boolean doesExist(String name) {
        return contactHashMap.containsKey(name);
    }
    public Contact changePhoneNumberByName(String name) {
        Contact targetContact = searchByName(name);
        if (targetContact != null) {
            targetContact.setPhoneNumber(getPhoneNumberInput());
        }
        return targetContact;
    }
    public Contact changeNameByName(String name) {
        Contact targetContact = searchByName(name);
        if (targetContact != null) {
            targetContact.setName(getNameInput());
        }
        return targetContact;
    }
    public Contact changeEmailByName(String name) {
        Contact targetContact = searchByName(name);
        if (targetContact != null) {
            targetContact.setEmail(getEmailInput());
        }
        return targetContact;
    }
    public Contact deleteContact(String name) {
        Contact targetContact = searchByName(name);
        contactArrayList.remove(targetContact);
        contactHashMap.remove(name);
        return targetContact;
    }



}
