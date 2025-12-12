package za.co.sammysa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverserString {

    public static String reverseStringWordByCharacter(String inputString){
        StringBuilder reversedString = new StringBuilder(); // to be used for our String Builder
        // 1. Check if the input string is empty else return
        if(inputString == null || inputString.isEmpty()){
            return "Inout string is empty or null.";
        }

        // If input string is valid the iterate through string per character
        List<Character> characters = new ArrayList<>();
        for(char c : inputString.toCharArray()){
            characters.add(c); // this will add each character to the list
        }

        // reverse the list of characters
        Collections.reverse(characters);

        for(char c : characters){
            reversedString.append(c); // append each character to the StringBuilder
        }

        return reversedString.toString();
    }
}
