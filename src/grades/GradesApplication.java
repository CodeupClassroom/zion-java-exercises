package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    static Map<String,Student> students;

    private static void init() {
        students = new HashMap<>();
        Student dwight = new Student("Dwight");
        dwight.addGrade(90);
        dwight.addGrade(85);
        dwight.addGrade(400);

        Student bethany = new Student("Bethany");
        bethany.addGrade(95);
        bethany.addGrade(86);
        bethany.addGrade(100);

        Student marcus = new Student("Marcus");
        marcus.addGrade(117);
        marcus.addGrade(250);
        marcus.addGrade(30);

        Student adrien = new Student("Adrien");
        adrien.addGrade(43);
        adrien.addGrade(26);
        adrien.addGrade(0);
        adrien.addGrade(147000);

        students.put("dbmister", dwight);
        students.put("bethanyramirez", bethany);
        students.put("marcus100", marcus);
        students.put("adrienVL", adrien);

    }
    private static void welcome() {
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" +
                "Here are the github usernames of our students:\n" +
                "\n" +
                usernames);
        System.out.println();
    }
    private static void outputStudentRecord(String key) {
        // compare studentChoice with usernames
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(key).getName(),key);
            System.out.printf("Current Average: %.2f%n%n", students.get(key).getGradeAverage());
            // output student record
        } else {
            System.out.printf("Sorry, no student found with the github username of \"%s\".%n", key);
        }

    }

    public static void main(String[] args) {
        Input input = new Input();
        init();
        welcome();
        boolean keepGoing = true;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentChoice = input.getString();
            System.out.println();

            outputStudentRecord(studentChoice);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println();
        } while (keepGoing);
    }
}
