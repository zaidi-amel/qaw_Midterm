package problems.string;

import java.util.Scanner;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */

    public static void main(String[] args) {

        //write your code here
        String str, reversed = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        str = sc.nextLine();
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            reversed = reversed + str.charAt(i);
        if (str.equals(reversed))
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+" is not a palindrome.");

    }


}
