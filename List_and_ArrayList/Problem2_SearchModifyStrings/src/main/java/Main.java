package List_and_ArrayList.Problem2_SearchModifyStrings.src.main.java;

import List_and_ArrayList.Problem1_UserInputStrings.src.main.java.UserInputStrings;
import Utilities.InputHandling;

public class Main {
    public static void main(String[] args) {
        UserInputStrings myInputs = new UserInputStrings();
        myInputs.addInput("Hello cruel world!");
        String funnyWord = "Borb";
        String seriousWord = "Deadline";
        myInputs.addInput(funnyWord);
        myInputs.addInput(seriousWord);
        myInputs.addInput(InputHandling.getInput());
        myInputs.printInputList();
        SearchModifyStrings stringModifier = new SearchModifyStrings();
        stringModifier.replaceFirstWholeIfPresent(myInputs.getUserInputs(), InputHandling.getInput(), InputHandling.getInput());
        myInputs.printInputList();

    }
}
