package oop;

class CustomException extends Exception {}

public class ExceptionsSandbox {


    public static void dangerMethod() throws CustomException {
        System.out.printf("Aaaah!!");
//        throw new CustomException();
        String[] words = {"one", "two", "three"};
        System.out.println(words[1000]);
    }
    public static void main(String[] args) {
        System.out.printf("Here we are at the start of our program!%n");

        String[] words = {"one", "two", "three"};
        int i = 3;

        try {
//            throw new Exception("oops");
//            if (i < 0 || i >= words.length) {
//                // array index is out of bounds!!
//                throw new CustomException();
//            }
            System.out.printf("Here we are in the danger zone!!%n");
            System.out.printf(words[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.printf("We are catching the built in exception%n");
            System.out.println(ex);
        }
        catch (Exception e) {
            System.out.printf("We are catching our own exception%n");
            System.out.println(e);
        } finally {
            System.out.printf("We should always get here%n");
        }

        try {
            dangerMethod();
        } catch (Exception ce) {
            System.out.printf("We caught something");
        }

        int d = 0;
        int n = 20;
        try {
            int fraction = n / d;
            System.out.println("This line will not be Executed");
        } catch (ArithmeticException e) {
            System.out.println("In the catch Block due to Exception = " + e);
        }
        System.out.println("End Of Main");

        System.out.println("Here we are at the end of our program!");
    }
}
