import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {

    public static void main(String[] args) {
        // add additional code to test the below methods
    }

    // Exercise 1
    public static double add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public static double subtract(double arg1, double arg2) {
        return arg1 - arg2;
    }

    public static double multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double divide(double arg1, double arg2) {
        return arg1 / arg2;
    }

    public static double modulus(double arg1, double arg2) {
        return arg1 % arg2;
    }


    // Exercise 2
    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;
    }

    // Exercise 3
    public static long calculateFactorial(int arg) {
        long output = 1;
        for (int i = 1; i <= arg; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void processFactorial() {
        boolean willContinue;
        do {
            System.out.println("Enter a number between 1 and 10");
            Scanner sc = new Scanner(System.in);
            int userInt = getInteger(1, 10);
            System.out.println("The factorial is: " + calculateFactorial(userInt));
            System.out.println("Do you wish to enter another number to calculate?");
            willContinue = sc.next().equals("y");
        } while(willContinue);
        System.out.println("Have a nice day!");
    }

    // Exercise 4
    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

    public static String rollDice(int sides) {
        return String.format("%d and %d", rollDie(sides), rollDie(sides));
    }

    public static void processDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number of sides for the dice");
        int sides = getInteger(1, 50);
        do {
            System.out.println("Rolling dice...");
            System.out.println("You rolled " + rollDice(sides));
            System.out.println("Do you wish to roll again [y/n]?");
        } while(sc.next().equals("y"));
    }


}
