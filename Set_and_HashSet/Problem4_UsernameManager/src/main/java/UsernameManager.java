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

    public boolean checkUsername(String username) {
        return usernames.contains(username);
    }

    public void addUsername(String username) {
        if (!checkUsername(username)) {
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
