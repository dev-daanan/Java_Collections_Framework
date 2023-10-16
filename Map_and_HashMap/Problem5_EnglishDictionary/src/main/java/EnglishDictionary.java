package Map_and_HashMap.Problem5_EnglishDictionary.src.main.java;

import java.util.HashMap;
import java.util.Map;

public class EnglishDictionary {
    private final HashMap<String, String> englishDictionary;

    public EnglishDictionary(HashMap<String, String> englishDictionary) {
        this.englishDictionary = new HashMap<>(englishDictionary);
    }

    public EnglishDictionary() {
        this(new HashMap<>());
    }

    /**
     * @param wordKey key to search for.
     * @return true if the Set contains wordKey.
     */
    public boolean wordExists(String wordKey) {
        return englishDictionary.containsKey(wordKey);
    }

    /**
     * @param word       key
     * @param definition value
     * @return true if word has been added successfully. returns false if word was already in Set
     */
    public boolean addWord(String word, String definition) {
        if (wordExists(word)) {
            System.out.println("\"" + word + "\" cannot be added as it already exists in dictionary. You may try editing the definition " +
                    "with the \"updateWord\" method.");
            return false;
        } else {
            englishDictionary.put(word, definition);
            return true;
        }
    }

    /**
     * @param word       key
     * @param definition value
     * @return true if word is in Set and has been updated. returns false if word isn't contained in dictionary
     */
    public boolean updateWord(String word, String definition) {
        if (wordExists(word)) {
            englishDictionary.put(word, definition);
            return true;
        } else {
            System.out.println("\"" + word + "\" doesn't exist in the dictionary yet. Please add it before updating it.");
            return false;
        }
    }

    public boolean removeWord(String wordKey) {
        if (wordExists(wordKey)) {
            englishDictionary.remove(wordKey);
            return true;
        }
        System.out.println(wordKey + " doesnt exist in the dictionary. No need to remove.");
        return false;
    }

    public void printDictionary() {
//        for (String key : englishDictionary.keySet()) {
//            System.out.println(key + " : " + englishDictionary.get(key));
//        }
        for (Map.Entry<String, String> entry : englishDictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void printDefinition(String wordKey) {
        if (englishDictionary.containsKey(wordKey)) {
            System.out.println(wordKey + " definition: " + englishDictionary.get(wordKey));
        } else {
            System.out.println("\"" + wordKey + "\"" +" doesn't exist in the dictionary");
        }

    }
}
