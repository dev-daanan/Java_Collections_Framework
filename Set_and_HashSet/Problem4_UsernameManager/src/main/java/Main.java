package Set_and_HashSet.Problem4_UsernameManager.src.main.java;

import Utilities.InputHandling;

public class Main {
    public static void main(String[] args) {
        UsernameManager usernameManager = new UsernameManager();
        usernameManager.addUsername("Ross");
        usernameManager.addUsername("Rachel");
        usernameManager.addUsername("Joey");
        usernameManager.addUsername("Monica");
        usernameManager.addUsername(InputHandling.getInput("Enter a username: "));
        System.out.println("Does 'Ross' exist in the Set: "+usernameManager.usernameExists("Ross"));
        System.out.println("Does 'Batman' exist in the Set: " +usernameManager.usernameExists("Batman"));
        usernameManager.displayAllUsernames();
        System.out.println("Number of names in set: " + usernameManager.getTotalUsernames());

    }
}
