package Projects.Project1_ContactManagementSystem.src.main.java;

public class Main {
    public static void main(String[] args) {
        ContactManagementSystem contactManagementSystem = new ContactManagementSystem();
        contactManagementSystem.addContact("z.monica geller", "monica@ragemail.com", "1234567899");
        contactManagementSystem.addContact("a.ross geller", "ross@ragemail.com", "1234567899");
        contactManagementSystem.addContact("e.rachel green", "rachel@ragemail.com", "1234567899");
        contactManagementSystem.addContact("w.joey tribiany", "joey@ragemail.com", "1234567899");
        contactManagementSystem.printContacts();
        contactManagementSystem.sortAlphabetically();
        System.out.println();
        System.out.println("sorted-".repeat(50));
        System.out.println();
        contactManagementSystem.printContacts();


    }
}
