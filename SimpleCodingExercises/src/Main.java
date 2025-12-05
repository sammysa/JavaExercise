import za.co.sammysa.CharacterFrequencyFinder;

public class Main {
    public static void main(String[] args) {
        String inputString = "HELLO World!";

        CharacterFrequencyFinder characterFrequencyFinder = new CharacterFrequencyFinder();

        System.out.println(inputString);
        System.out.println(characterFrequencyFinder.findMostFrequentCharacter(inputString));

    }
}