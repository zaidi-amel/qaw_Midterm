package shufflegame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame implements GameRoadMap{

    Scanner scanner = new Scanner(System.in);

    int[] array = {1, 0 ,1};

    /**
     * method that takes an array shuffles the components in random way and returns it
     * @param array: array to shuffle
     * @return array: shuffled array
     */
    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     * @return playerGuess: userInput value
     */
    public int playerGuess() {
        //implement here
        String pick;
        pick = scanner.nextLine();
        while (!(pick.equalsIgnoreCase("1")) && !(pick.equalsIgnoreCase("2")) && !(pick.equalsIgnoreCase("3"))) {
            System.out.println("invalid entry, please enter 1, 2 or 3");
            pick = scanner.nextLine();
        }
        return Integer.parseInt(pick);
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, int playerGuess) {
        //implement here

        //System.out.println("player guess index "+playerGuess+" and check calcul "+shuffledArray[playerGuess]);
        int index = playerGuess - 1;
        if (shuffledArray[index] == 0) {
            System.out.println("Good Guess! ");
        } else {
            System.out.println("Sorry !! Wrong Guess ");
        }

    }

    /**
     * uses the previous functions in a good sequential way to run the game
     * uses the method recursion in order to loop in the game
     */
    public void play() {
        System.out.println("------------------------------welcome to shuffle game--------------------------------\n" +
                "guess where the 0 is ?");
        String tryAgainAnswer = null;
        do {
            //implement here


            //Ask player if ready or not
            System.out.println("Are you ready to play? y/n ");
            String answer = scanner.nextLine();

            while (!(answer.equalsIgnoreCase("Y")) && !(answer.equalsIgnoreCase("N"))) {
                System.out.println("invalid entry, please enter y or n");
                answer = scanner.nextLine();
            }

            if (answer.equalsIgnoreCase("y")) {
                int[] shuffledArray = shuffleGame(array);

                //ask user to pick a position
                System.out.println("pick 1, 2 or 3! ");
                System.out.println("shuffeled array " + Arrays.toString(shuffledArray));
                //System.out.println("reponse user guess "+playerGuess());
                checkGuess(shuffledArray, playerGuess());
                System.out.println("do you want to try again? y/n");
                tryAgainAnswer = scanner.nextLine();
                while (!(tryAgainAnswer.equalsIgnoreCase("Y")) && !(tryAgainAnswer.equalsIgnoreCase("N"))) {
                    System.out.println("invalid entry, please enter y or n");
                    tryAgainAnswer = scanner.nextLine();
                }


            }else {
                break;
            }

        } while (tryAgainAnswer.equalsIgnoreCase("y"));
        System.out.println("---------------------------------see you next time!-----------------------------------");

    }

}
