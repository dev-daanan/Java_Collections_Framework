package Projects.Project1_ContactManagementSystem.src.main.java;

public class Contact implements Comparable<Contact> {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name) {
        this(name, "noEmail@provided.com","1234567890");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Contact otherContact) {
        return this.name.compareTo(otherContact.name);
    }

    @Override
    public String toString() {
        return "Contact: " +
                "name='" + name + '\'' +
                ", email= '" + email + '\'' +
                ", phoneNumber= '" + phoneNumber + '\'';
    }
}
