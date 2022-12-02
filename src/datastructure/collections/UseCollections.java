package datastructure.collections;
import java.util.*;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

    public static Set<Integer> union(int [] array1, int[] array2) {
        Set<Integer> unionList = new HashSet<Integer>();
        Integer[] IntegerArray1 = Arrays.stream(array1).boxed().toArray(Integer[]::new);
        Integer[] IntegerArray2 = Arrays.stream(array2).boxed().toArray(Integer[]::new);

        Collections.addAll(unionList,IntegerArray1);
        Collections.addAll(unionList,IntegerArray2);

        return (unionList);
    }

    public static List<java.lang.Integer> intersection(int[] array1, int[] array2) {

        List<java.lang.Integer> InterList = new ArrayList<>();
        java.lang.Integer[] IntegerArray1 = Arrays.stream(array1).boxed().toArray(java.lang.Integer[]::new);
        java.lang.Integer[] IntegerArray2 = Arrays.stream(array2).boxed().toArray(java.lang.Integer[]::new);
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(IntegerArray1));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(IntegerArray2));
        for (   java.lang.Integer nbr : IntegerArray1) {
            if (s2.contains(nbr)) {
                InterList.add(nbr);
            }
        }
        return (InterList);
    }
    public static List<java.lang.Integer> differenceList(int[] array1, int[] array2) {

        List<java.lang.Integer> diffList = new ArrayList<>();
        java.lang.Integer[] IntegerArray1 = Arrays.stream(array1).boxed().toArray(java.lang.Integer[]::new);
        java.lang.Integer[] IntegerArray2 = Arrays.stream(array2).boxed().toArray(java.lang.Integer[]::new);
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(IntegerArray1));
        Set<Integer> union= union(array1,array2);
        List<Integer> intersection =intersection(array1,array2);
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(IntegerArray2));
        for ( java.lang.Integer nbr : union) {
            if (!(intersection.contains(nbr))){
                diffList.add(nbr);
            }
        }
        return (diffList);
    }
    public static void main(String[] args) {

        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};
        Set<Integer> union= union(array1,array2);
        List<Integer> intersection =intersection(array1,array2);

        System.out.println(union(array1,array2));
        System.out.println(intersection(array1,array2));
        System.out.println( differenceList(array1,array2));;



    }

}
