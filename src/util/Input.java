package util;

import javax.xml.transform.TransformerException;
import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }
    @Deprecated
    public boolean yesNo() {
        String result = sc.nextLine();
//        while (result.equals("")) result = sc.nextLine();
        return result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes");
    }
    public boolean yesNo(boolean readUntilString) {
        String result = sc.nextLine();
        if (readUntilString)
            while (result.equals("")) result = sc.nextLine();
        return result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes");
    }
    public int getInt() {
//        if (sc.hasNextInt()) {
//            return sc.nextInt();
//        }
//        sc.next();
//        return getInt();
        Integer num;
        String input = sc.nextLine();
        try {
            num = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            num = getInt();
        }
        return num;

    }

    int getInt(int min, int max) throws NumberFormatException {
        Integer userInt;
        String input = sc.nextLine();
        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
//        sc.next();
        return getInt(min, max);
    }

    public double getDouble() throws TransformerException {
        Double num;
        String input = sc.nextLine();
        try {
            num = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            throw new TransformerException("Input is not a Double Value");
//            num = getDouble();
        }
        return num;
    }

    double getDouble(double min, double max) {
        Double userDouble;
        String input = sc.nextLine();
        try {
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble(min, max);
        }
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
//        sc.next();
        return getDouble(min, max);
    }

    public static void main(String[] args) {
        Input in = new Input();
//        System.out.println(in.getString());
//        System.out.println("Enter yes or no [y/n]");
//        System.out.println(in.yesNo());

        System.out.println(in.getDouble(.34, .367));
    }

}
