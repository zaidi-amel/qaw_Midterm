package problems.math;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void makePyramid(int nbrLignes){

        for (int nomLigne = 1; nomLigne <= nbrLignes; nomLigne++) {

            for (int i = nbrLignes - nomLigne; i > 0; i--){
                System.out.print(" ");
            }


            for (int i = 0; i < 2 * nomLigne - 1; i++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        makePyramid(8);


    }
}
