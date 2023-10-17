package Projects.Project1_ContactManagementSystem.src.main.java;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("z.monica geller", "monica@ragemail.com", "1234567899");
        contactManager.addContact("a.ross geller", "ross@ragemail.com", "1234567899");
        contactManager.addContact("e.rachel green", "rachel@ragemail.com", "1234567899");
        contactManager.addContact("w.joey tribiany", "joey@ragemail.com", "1234567899");
        contactManager.printContacts();
        contactManager.sortAlphabetically();
        System.out.println();
        System.out.println("sorted-".repeat(50));
        System.out.println();
        contactManager.printContacts();


    }
}
