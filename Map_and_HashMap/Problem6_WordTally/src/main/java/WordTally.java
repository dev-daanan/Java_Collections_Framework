package Map_and_HashMap.Problem6_WordTally.src.main.java;

import java.util.HashMap;
import java.util.Map;

public class WordTally {
    private final HashMap<String, Integer> wordTally;

    public WordTally(HashMap<String, Integer> wordTally) {
        this.wordTally = new HashMap<>(wordTally);
    }

    public WordTally() {
        this.wordTally = new HashMap<>();
    }

    public String[] preprocessString(String longString) {
        longString = longString.toLowerCase();
//        String[] strings = longString.split("[^a-zA-Z0-9]+");
        String[] strings = longString.split("[\\W]+");
        return strings;
    }

    public void performTally(String longString) {
        wordTally.clear();
        String[] strings  = preprocessString(longString);
        System.out.println(strings.length);
        for (String currentKey : strings) {
            if (wordTally.containsKey(currentKey)) {
                wordTally.put(currentKey, wordTally.get(currentKey) + 1);
            } else {
                wordTally.put(currentKey, 1);
            }
        }
    }

    public void printWordTally() {
        for (Map.Entry<String, Integer> entry : wordTally.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
