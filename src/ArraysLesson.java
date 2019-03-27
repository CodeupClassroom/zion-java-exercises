import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {

        int[] phoneNumber = new int[7];
        int[] phoneNumber2;// = new int[7];

        boolean[] decisions = {true,true,false,false}; // new boolean[4]
        String[] answers = new String[4];

        answers[0] = "Yes";
        answers[1] = "True";
//        answers[7] = "Something's wrong";
//        System.out.println(answers[answers.length - 1]);
//        if (numbers[4] == 0) System.out.println("It really is zero");

        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
//
//        System.out.println(daysOfWeek);
//        for (int i = 0;i < daysOfWeek.length; i++) {
//            System.out.println(daysOfWeek[i]);
//        }
//
//        for (String day : daysOfWeek) {
//            System.out.println(day);
//        }
//
//        for (boolean decision : decisions) {
//            System.out.println(decision);
//        }

        Arrays.fill(phoneNumber,4);
//        for (int digit : phoneNumber) {
//            System.out.print(digit);
//        }

        System.out.println();
        phoneNumber2 = Arrays.copyOf(phoneNumber,8);
//        Arrays.fill(phoneNumber2, 7);
//        for (int digit : phoneNumber2) {
//            System.out.print(digit);
//        }
//        System.out.println(Arrays.toString(phoneNumber2));
//        if (Arrays.equals(phoneNumber,phoneNumber2)) {
//            System.out.println("They are equal");
//        } else {
//            System.out.println("They are different");
//        }

        System.out.println(Arrays.toString(daysOfWeek));
        Arrays.sort(daysOfWeek);
        System.out.println(Arrays.toString(daysOfWeek));

        String[][] java2dArray = new String[3][3];
        java2dArray[2][1] = "String Value";

        char[][] chessBoard = {
                {'R','N','B','Q','K','B','N','R'},
                {'P','P','P','P','P','P','P','P'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'p','p','p','p','p','p','p','p'},
                {'r','n','b','q','k','b','n','r'}
        };

    }
}
