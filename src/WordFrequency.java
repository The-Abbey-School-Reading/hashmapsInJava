import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Sample sentence
        String sentence = "This is a sample sentence and this sentence is just a sample of this and this will work on this";

        // Split the sentence into words
        String[] words = sentence.toLowerCase().split(" ");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print the word frequencies
        System.out.println("Word Frequencies: " + wordCount);
    }
}