import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bobIsStillTalking = true;

        do {
            System.out.println("Say something to Bob:");
            String convoAttempt = scanner.nextLine();

            if (convoAttempt.isEmpty()) {
                System.out.println("Bob: 'Fine. Be that way!'");
            } else if (convoAttempt.endsWith("?")) {
                System.out.println("Bob: 'Sure.'");
            } else if (convoAttempt.endsWith("!")) {
                System.out.println("Bob: 'Whoa, chill out!'");
            } else if (convoAttempt.equals("bye")) {
                System.out.println("Bob: 'later.'");
                bobIsStillTalking = false;
            } else {
                System.out.println("Bob: 'Whatever.'");
            }

        } while (bobIsStillTalking);
        System.out.println("Bob walks away...");
    }
}
