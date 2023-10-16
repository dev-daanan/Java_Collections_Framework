package Set_and_HashSet.Problem4_UsernameManager.src.main.java;

import java.util.HashSet;

public class UsernameManager {
    private final HashSet<String> usernames;

    public UsernameManager(HashSet<String> usernames) {
        this.usernames = usernames;
    }

    public UsernameManager() {
        usernames = new HashSet<>();
    }

    public boolean usernameExists(String username) {
        boolean usernameExists = usernames.contains(username);
        if (usernameExists) {
            System.out.println(username + " already exists in the Set.");
        } else {
            System.out.println(username + " doesn't exist in the Set.");
        }
        return usernameExists;
    }

    public void addUsername(String username) {
        if (!usernameExists(username)) {
            usernames.add(username);
            System.out.println(username + " entered to the list successfully!");
        } else {
            System.out.println(username + " CANNOT be added as it already exists in the list!");
        }
    }

    public void displayAllUsernames() {
        for (String username : usernames) {
            System.out.println(" - " + username);
        }
    }

    public int getTotalUsernames() {
        return usernames.size();
    }

}
