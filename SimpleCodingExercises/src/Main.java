import za.co.sammysa.*;

public class Main {
    public static void main(String[] args) {
        String inputString = "";
        int[] numbers = { 7, 8, 5, 8, 63, 98, 99, 4, 89, 84, 8, 4, 34 };

        // Character Finder Example
        CharacterFrequencyFinder characterFrequencyFinder = new CharacterFrequencyFinder();
        StringWordGenerator wordGenerator = new StringWordGenerator();
        SensibleStringWordGenerator sensibleStringWordGenerator = new SensibleStringWordGenerator();

        inputString = wordGenerator.generateRandomWord(10); // Generate a random word of input length

        System.out.println(inputString);
        System.out.println(characterFrequencyFinder.findMostFrequentCharacter(inputString));

        System.out.println("********###########&&&&&&&&&&&@@@@@@@@@@@@@@@@");

        // Example output for the SensibleStringWordGenerator
        inputString = sensibleStringWordGenerator.generateSensibleStringWord();
        System.out.println(inputString);
        System.out.println(characterFrequencyFinder.findMostFrequentCharacter(inputString));

        System.out.println("********###########&&&&&&&&&&&@@@@@@@@@@@@@@@@");

        // Reverser String Example
        ReverserString reverserString = new ReverserString();
        // We will use the sensible word generator to parse a sensible string
        System.out.println("-------- Reversed String: " + reverserString.reverseStringWordByCharacter(inputString));
        //We will set our own sensible string
        inputString = "Hello Mr Computer!! Welcome to the world";
        System.out.println("******** Reversed String: " + reverserString.reverseStringWordByCharacter(inputString));

        System.out.println("********###########&&&&&&&&&&&@@@@@@@@@@@@@@@@");
        // Find the 2nd highest number in the array
        NumberSequenceOrder numberSequenceOrder = new NumberSequenceOrder();
        System.out.println("The 2nd highest number is: " + numberSequenceOrder.findSecondHighestNumber(numbers));

    }
}