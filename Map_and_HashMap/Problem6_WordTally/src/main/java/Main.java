package Map_and_HashMap.Problem6_WordTally.src.main.java;

public class Main {
    public static void main(String[] args) {
        String numString = "one $$two&two. three.three.three four four four four.";
        WordTally wordTally = new WordTally();
        wordTally.performTally(numString);
        System.out.println("-".repeat(50));
        wordTally.printWordTally();
    }
}
