package za.co.sammysa;

import java.util.Random;

public class SensibleStringWordGenerator {

    public static String generateSensibleStringWord() {
        String sensibleStringWord = "";

        String[] words = {
                "One morning, when Gregor Samsa woke from troubled dreams",
                "A wonderful serenity has taken possession of my entire soul",
                "Far far away, behind the word mountains, far from the",
                "But I must explain to you how all this mistaken",
                "The European languages are members of the same family.",
                "The quick, brown fox jumps over a lazy dog.",
                "Like these sweet mornings of spring which I enjoy with",
                "He found himself transformed in his bed into a horrible vermin.",
                "What's your favorite thing about your room?",
                "Do you have a favorite Disney Channel Original Movie, or another made-for-TV movie?",
                "What's a regular daily item you wish you never had to buy again?",
                "LOVE HELLo World!!"
        };

        Random random = new Random();
        // Generate a random index to select a word from the array
        int randomIndex = random.nextInt(words.length);

        // Retrieve the word at the random index
        sensibleStringWord = words[randomIndex];

        return sensibleStringWord;
    }
}
