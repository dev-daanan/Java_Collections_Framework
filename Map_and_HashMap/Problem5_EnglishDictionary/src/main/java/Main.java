package Map_and_HashMap.Problem5_EnglishDictionary.src.main.java;

public class Main {
    public static void main(String[] args) {
        EnglishDictionary englishDictionary = new EnglishDictionary();
        englishDictionary.addWord("cat", "a cat is an animal");
        englishDictionary.addWord("bowl", "a bowl is an dish you eat cereal from");
        englishDictionary.addWord("computer", "a computer is a magic box that usually comes with a magic screen");
        englishDictionary.addWord("fan", "it keeps you cool");

        englishDictionary.printDictionary();
        englishDictionary.updateWord("fan", "someone that loves something, EExample: Joey is a fan of pizza");
        englishDictionary.updateWord("sandwich", "Bread and meat and sauce");

        System.out.println("-".repeat(50));

        englishDictionary.printDictionary();
        System.out.println("-".repeat(50));
        englishDictionary.addWord("cat", "DEMON. STAY AWAY.");

        englishDictionary.printDefinition("cat");
        englishDictionary.printDefinition("cattttt");

    }
}
