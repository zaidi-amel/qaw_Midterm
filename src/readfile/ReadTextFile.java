package readfile;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;


        LinkedList<String> myList = new LinkedList<String>();
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\amel\\OneDrive\\Documents\\QA\\Midterm\\java-coding-exam\\src\\readfile\\file-data"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);

                myList.add(Arrays.toString(str.split(" ")));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        System.out.println(myList);
        System.out.println(myList.size());
        //System.out.println(myList.get(0));









    }

}
