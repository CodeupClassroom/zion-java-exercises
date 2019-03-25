import java.util.Random;
import java.util.Scanner;

// Exercise 5
public class HighLow {

    public static Random rn = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runGame();
    }

    public static int getRandInt(int min, int max) {
        return rn.nextInt(max) + min;
    }

    public static String getGuessMessage(int outcome) {
        String output;
        if (outcome == 0) {
            output = "GOOD GUESS!";
        } else if (outcome == 1) {
            output = "LOWER";
        } else {
            output = "HIGHER";
        }
        return output;
    }

    public static int processGuess(int answer, int guess) {
        if (guess == answer) {
            return 0;
        }
        return (guess < answer) ? -1 : 1;
    }

    public static void runGame() {
        System.out.println("Welcome to the High Low Game!");
        int answer = getRandInt(1, 100);
        int outcome;
        do {
            System.out.println("Please pick a number between 1 and 100");
            int guess = MethodsExercises.getInteger(1, 100);
            outcome = processGuess(answer, guess);
            System.out.println(getGuessMessage(outcome));
        } while (outcome != 0);
        System.out.println("Do you wish to play again?");
        if (sc.next().equals("y")) {
            runGame();
        }
        System.out.println("Have a nice day!");
    }

}
