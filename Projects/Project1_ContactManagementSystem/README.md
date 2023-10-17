# Project 1: Contact Management System

Implement a contact management system using various Collection classes. The system should have the capability to:

- **Add new contacts:** Name, Phone Number, Email, etc.
- **Search contacts:** By name, email, etc.
- **Modify contacts:** Change phone number, email, etc.
- **Delete contacts**

Use ArrayList to store contacts and HashMap to store a mapping from contact names to their respective details for efficient search. Also, consider implementing features like sorting contacts alphabetically, which would allow you to use and understand Comparator/Comparable.


# Pro's, Con's, and To-dos
### Pros:
- **Use of OOP principles:**
  - Your classes (Contact and ContactManager) have clear responsibilities, which makes the code modular and easy to understand.
- **Overloaded Constructors:**
  - Both Contact and ContactManager have overloaded constructors, providing flexibility in creating instances.
- **Efficient Search:**
  - Using a HashMap for search operations by name ensures O(1) complexity, which is efficient.
- **Sensible Defaults:**
  - Providing default values (like in the single parameter constructor of Contact) can be useful for quick initialization.
- **Alphabetical Sorting:**
-   You've implemented sorting using the Comparable interface in the Contact class, which is a great application of the interface.
### Cons:
- **Mutable Contacts:** 
  - You've provided setters for all properties of a Contact. This means a contact's name can change after it's been added, potentially causing discrepancies in your HashMap where the contact's name is the key. Consider making the name property immutable, or if changing the name is necessary, ensure you update the HashMap's keys.
- **Case Sensitivity:** 
  - The search by name uses the case-sensitive get method of the HashMap. This might cause issues if the user isn't consistent with case when adding or searching contacts.
- **Lack of Input Validation:** 
  - Methods like addContact() blindly add a contact even if one with the same name already exists. It would be good to add some validation to prevent overwriting contacts.
- **Missing Email Search Efficiency:** 
  - While you've used a HashMap to search by name, email searches use a linear search through the ArrayList. To improve this, you could maintain a separate HashMap using the email as the key.
- **Incomplete UI:** 
  - The changePhoneNumberByName(), changeNameByName(), and changeEmailByName() methods seem to suggest a user interface with methods like getNameInput() and getPhoneNumberInput(), but these methods are missing. It's essential to provide a complete implementation or mock these methods for testing.
- **Limited Error Handling:** 
  - There's no feedback or error handling when searching for a contact that doesn't exist, trying to delete a non-existent contact, etc.
### Suggestions:
- **Enhance the UI:** 
  - Consider adding a simple user interface (UI) for interactions. It could be a command-line interface where users can select options and provide inputs.
- **Expand Contact Details:** 
  - You could expand the Contact class to include more details, like addresses, multiple phone numbers, notes, etc.
- **Advanced Features:** 
  - Consider adding features like searching contacts with partial names, storing contact's birthday and sending reminders, or categorizing contacts (friends, work, family).
- **Enhanced Sorting:** 
  - Use Comparator to allow sorting by different criteria, like by email, phone number, etc.

Overall, your project has a good start and foundation. With further refinement and the addition of advanced features, it could become a robust Contact Management System.