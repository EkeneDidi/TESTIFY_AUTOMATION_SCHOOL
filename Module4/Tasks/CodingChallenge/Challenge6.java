package CodingChallenge;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Challenge6 {
    public static void main(String[] args) {
        String sentence = "Despite commuting at the peek hour, she was able to keep to time";

        String[] givenWords = sentence.split("\\s+");

        Map<String, StringBuilder> anagramMap = new HashMap<>();

        for (String word : givenWords) {
            // Remove non-alphabetic characters and convert to lowercase for case-insensitive comparison
            String changedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Sort the characters in the word
            char[] charArray = changedWord.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the sorted word to the map
            if (anagramMap.containsKey(sortedWord)) {
                anagramMap.get(sortedWord).append(" ").append(word);
            } else {
                anagramMap.put(sortedWord, new StringBuilder(word));
            }
        }

        // Print the groups of anagrams
        for (StringBuilder group : anagramMap.values()) {
            System.out.println("Anagram Group is : " + group);
        }
    }
}