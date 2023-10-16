package List_and_ArrayList.Problem1_UserInputStrings.src.main.java;

public class Main {
    public static void main(String[] args) {
        UserInputStrings myInputs = new UserInputStrings();
        myInputs.addInput("Hello cruel world!");
        String funnyWord = "Borb";
        String seriousWord = "Deadline";
        myInputs.addInput(funnyWord);
        myInputs.addInput(seriousWord);
        myInputs.printInputList();
    }

}
