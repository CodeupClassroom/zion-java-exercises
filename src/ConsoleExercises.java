import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.format("The value of pi is approximately %.2f.%n", pi);
        // The value of pi is approximately 3.14.

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int num = scanner.nextInt();
//        System.out.format("You entered: %d%n", num);

//        System.out.print("Please enter 3 words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//        String random = scanner.nextLine();
//
//        System.out.println("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.printf("Your sentence: %s%n", sentence);
//        System.out.format("Here is the random variable: %s%n", random);

        System.out.print("Please enter length of classroom in feet: ");
        double length = new Double(scanner.nextLine());
        System.out.print("Please enter width of classroom in feet: ");
        double width = scanner.nextDouble();
        System.out.printf("The area of the classroom is %.2f square feet.", length * width);
        System.out.printf("The perimeter of the classroom is %.2f feet.", 2*(length + width));
    }
}
