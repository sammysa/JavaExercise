package za.co.sammysa;

import java.util.*;

public class NumberSequenceOrder {

    public static int findSecondHighestNumber(int[] inputNumbers){
        if(inputNumbers == null || inputNumbers.length < 2){
            throw new IllegalArgumentException("Array must contain atleast 2 numbers.");
        }

        //Convert array to List
        List<Integer> numberList = new ArrayList<>();
        for(int i : inputNumbers){
            numberList.add(i);
        }

        // Removes duplicates in the List by using a Set
        Set<Integer> uniqueNumbers = new HashSet<>(numberList);
        if(uniqueNumbers.size() < 2){
            throw new IllegalArgumentException("Array does not contain a distict 2nd highest number.");
        }

        // Convert back to List for sorting
        List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedList, Collections.reverseOrder()); // Sort in descending order

        return sortedList.get(1);
    }
}
