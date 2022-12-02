package problems.math;
import java.util.ArrayList;


public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
     */

    public static void main(String[] args) {
        //int [] differenceArray = {};
        ArrayList<Integer> differenceArray = new ArrayList<>();
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                Integer difference = (Integer)Math.abs(array1[i] - array2[j]);

                differenceArray.add(difference);

            }
        }
        int min = differenceArray.get(0);
        for(int i: differenceArray){
            if(i < min){
                min = i;
            }

        }
        System.out.println(min);

    }
}