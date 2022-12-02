package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";

        //write your code here
        String[] words = str.split(" ");
        String word= " ";
        int len = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > len){
                word = words[i];
                len = words[i].length();
            }
        }
        System.out.println("The longest word is ("+word +"). Length = "+len);

    }

}
