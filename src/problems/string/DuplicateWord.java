package problems.string;

import java.util.*;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";

        // splitting words using regex
        String[] words = str.toLowerCase().trim().split(" ");
        Map<String, Integer> duplicateString = new HashMap<>();
        int count = 1;
        for (String x : words) {
            if (duplicateString.containsKey(x)) {
                duplicateString.put(x, duplicateString.get(x) + 1);
            } else {
                duplicateString.put(x, count);
            }
        }
        System.out.println("Duplicate Words in the String with their occurences : ");
        for (Map.Entry a : duplicateString.entrySet()) {
            int val = (Integer) a.getValue();
            if (val > 1) {
                System.out.println(a);
            }
        }
    }
}






