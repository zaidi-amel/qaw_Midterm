package problems.string;

import java.util.Scanner;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */

    static void permutation(String str, String result) {

        if (str.length() == 0) {
            System.out.print(result + " ");
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String s = str.substring(0, i) + str.substring(i + 1);

            permutation(s, result + ch);
        }
    }

    public static void main(String[] args) {
        //"ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        permutation(word, "");


    }
}
