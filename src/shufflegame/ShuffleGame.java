package shufflegame;

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
        return 0;
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, int playerGuess) {
        //implement here
    }

    /**
     * uses the previous functions in a good sequential way to run the game
     * uses the method recursion in order to loop in the game
     */
    public void play() {
        //implement here
    }

}
