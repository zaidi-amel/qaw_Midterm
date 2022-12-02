package datastructure.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 3, 3, 4, 1, 7, 1, 0, 7, 4, 5, 0, 9, 8);
        System.out.println(set);

        for( int i: set){
            System.out.println(i);
        }
        System.out.println("Number of elements : "+set.size());
        //remove numbers 1 and 0 from the set
        set.remove(1);
        set.remove(0);
        System.out.println(set);



    }
}
