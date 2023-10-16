package List_and_ArrayList.Problem1_UserInputStrings.src.main.java;

import java.util.ArrayList;

public class UserInputStrings {
    private ArrayList<String> userInputs;

    public void addInput(String s) {
        userInputs.add(s);
    }
    public void printInputList() {
        for (String input : userInputs) {
            System.out.println(" - " + input);
        }
    }

    public UserInputStrings(ArrayList<String> userInputs) {
        this.userInputs = userInputs;
    }
    public UserInputStrings() {
        this(new ArrayList<String>());
    }

    public ArrayList<String> getUserInputs() {
        return userInputs;
    }

    public void setUserInputs(ArrayList<String> userInputs) {
        this.userInputs = userInputs;
    }
}
