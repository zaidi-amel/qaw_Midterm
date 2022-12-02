package problems.string;

import java.util.Arrays;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */

    public static void anagram(String str1, String str2) {
        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);

            if (isAnagram) {
                System.out.println(str1 + " and " + str2 + " are Anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not Anagram.");
            }
        }
    }

    public static void main(String[] args) {

        anagram("ARMY","MARY");
        anagram("look","cool");

    }

}
