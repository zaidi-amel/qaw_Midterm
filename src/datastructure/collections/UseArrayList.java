package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve
     * and print out data
     *
     */

    //write your code here

    ArrayList<String> sports = new ArrayList<String>();

    public ArrayList<String> addElements() {
        sports.add("Volleyball");
        sports.add("Tennis");
        sports.add("Football");
        sports.add("Basketball");
        return sports;
    }
    //Iterator


    // Example: remove elements that contains the word ball

    public ArrayList<String> removeElem(String elem) {
        Iterator<String> iter = sports.iterator();
        while(iter.hasNext()) {
            String i = iter.next();
            if (i.contains(elem)){
                iter.remove();
            }
        }
        return sports;
    }

    // (3) loop through the arraylist using while loop
    public void loopArrayWhile(){
        Iterator<String> iter = sports.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


    public void loopArrayFor(){
        for(String element: sports){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        UseArrayList array1 = new UseArrayList();
        System.out.println(array1.addElements());
        array1.loopArrayFor();
        array1.loopArrayWhile();
        // Example: remove elements that contains the word ball
        System.out.println(array1.removeElem("ball"));








        //System.out.println("first element "+iter.next());









    }
}
