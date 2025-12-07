package za.co.sammysa;

import java.util.Random;

public class StringWordGenerator {
    /**
     * In this class we will generate a random word that will be passed to the
     * CharacterFrequencyFinder class for analysis.
     *
     * The aim is to try generate a unique word each time the program is run.
     */
    public static String generateRandomWord(int wordLength){ // receives a word length
        StringBuilder randomWord = new StringBuilder(wordLength);
        String alphabetCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        for(int i = 0; i < wordLength; i++){
            // Generate a romdom index within the range of the alphabetCharacters string
            int index = random.nextInt(alphabetCharacters.length());
            // Append the character at the random index to the randomWord
            randomWord.append(alphabetCharacters.charAt(index));
        }

        return randomWord.toString();

    }
}
