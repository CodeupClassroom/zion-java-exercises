import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        byte num1 = 100;
        int num2 = 100;
        if (num1 == num2) {
            System.out.println("Hey look, they're equal!");
        } else {
            System.out.println("They are not equal.");
        }
        char letter = '!';
        for (int i = Character.valueOf(letter);i < Character.valueOf('z'); i++) {
            System.out.format("%d = '%s'%n",i,letter);
            letter++;
        }

    }
}
