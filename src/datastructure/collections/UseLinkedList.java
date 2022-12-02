package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here


        LinkedList<String> sports = new LinkedList<>();
        sports.add("Volleyball");
        sports.add("Tennis");
        sports.add("Football");
        sports.add("Basketball");
        //for each loop
        for( String sport: sports){
            System.out.println(sport);
        }

        sports.remove("Tennis");
        System.out.println(sports);
        //for loop with Iterator
        Iterator<String> iterator = sports.iterator();
        for(Iterator i = sports.iterator(); i.hasNext(); ) {

            System.out.println(i.next());
        }
        //while loop with Iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
