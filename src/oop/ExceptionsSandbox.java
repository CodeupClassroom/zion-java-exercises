package oop;

public class ExceptionsSandbox {

    public static void main(String[] args) {
        System.out.printf("Here we are at the start of our program!%n");

        String[] words = {"one", "two", "three"};
        int i = 3;

        try {
//            if (i < 0 || i >= words.length) {
//                // array index is out of bounds!!
//                throw new Exception("Array index was erroneous!!!");
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
        }

        System.out.println("Here we are at the end of our program!");
    }
}
