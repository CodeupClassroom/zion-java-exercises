package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }
    public boolean yesNo() {
        String result = sc.nextLine();
//        while (result.equals("")) result = sc.nextLine();
        return result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes");
    }
    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        sc.next();
        return getInt();
    }

    int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        sc.next();
        return getInt(min, max);
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        }
        sc.next();
        return getDouble();
    }

    double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        sc.next();
        return getDouble(min, max);
    }

    public static void main(String[] args) {
        Input in = new Input();
//        System.out.println(in.getString());
//        System.out.println("Enter yes or no [y/n]");
//        System.out.println(in.yesNo());

        System.out.println(in.getInt(2, 4));
    }

}
