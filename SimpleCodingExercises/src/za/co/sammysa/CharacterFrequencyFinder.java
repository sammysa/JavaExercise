package za.co.sammysa;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyFinder {
    /**
     * Finds the character that occurs the most in a String and its count.
     * @param inputString The string to analyze.
     * @return A String containing the most frequent character and its count.
     */
    public static String findMostFrequentCharacter(String inputString){
        // our variables that will return the results
        char mostFrequentChar = ' ';
        int maxCount = 0;

        // Check if the input string is null or empty
        if(inputString == null || inputString.isEmpty()){
            return "Input string is null or empty.";
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        // Iterate through the string value and pupulate a Map with character counts
        for(char c : inputString.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCounts.entrySet()){
            int currentCount = entry.getValue(); // get the count for this character

            if(currentCount > maxCount) {
                maxCount = currentCount; // update max countCount
                mostFrequentChar = entry.getKey(); // update most frequent character
            }
        }

        // return result
        return "Most Frequent Character: '" + mostFrequentChar +
                "', Character Occurrence Counter: " + maxCount;
    }
}
