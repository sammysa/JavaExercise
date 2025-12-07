import za.co.sammysa.CharacterFrequencyFinder;
import za.co.sammysa.SensibleStringWordGenerator;
import za.co.sammysa.StringWordGenerator;

public class Main {
    public static void main(String[] args) {
        String inputString = "";

        CharacterFrequencyFinder characterFrequencyFinder = new CharacterFrequencyFinder();
        StringWordGenerator wordGenerator = new StringWordGenerator();
        SensibleStringWordGenerator sensibleStringWordGenerator = new SensibleStringWordGenerator();

        inputString = wordGenerator.generateRandomWord(10); // Generate a random word of input length

        System.out.println(inputString);
        System.out.println(characterFrequencyFinder.findMostFrequentCharacter(inputString));

        // Example output for the SensibleStringWordGenerator
        inputString = sensibleStringWordGenerator.generateSensibleStringWord();
        System.out.println(inputString);
        System.out.println(characterFrequencyFinder.findMostFrequentCharacter(inputString));

    }
}