import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] banana) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What is your favorite number? ");
        int favoriteNumber = scanner.nextInt();

        System.out.format("Hello " + name + ". Your favorite number is %d", favoriteNumber);
    }
}
