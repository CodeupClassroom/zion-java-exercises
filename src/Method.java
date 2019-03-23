public class Method {
    public static void main(String[] args) {
//        String message = "Hello, Zion!";
//        System.out.println(vegas(message));
//        System.out.println(message);
//        message = vegas(message);
//        System.out.println(message);
//        Student cory = new Student("Cory", 99);
//        Student bethany = new Student("Bethany",99);
//        System.out.println(Student.studentCount);
//        System.out.println(sayHello(bethany.name));
//        System.out.format("Area of circle with radius 3 is %f", areaOfCircle(3));
//        System.out.println(sayHello("Zion", "Salutations"));

        System.out.println(multiply(100,5));
    }

    public static int multiply(int first, int second) {
        if (first == 1) {
            System.out.println("We are at first == 1");
            return second;
        }
        else {
            System.out.printf("First == %d, Second == %d%n", first, second);
            return second + multiply(first - 1, second);
        }
    }

//    public static String sayHello(String name) {
//        return sayHello(name,"Hello");
//    }
//
//    public static String sayHello(String name, String greeting) {
//        return String.format("%s, %s!", greeting, name);
//    }
//
//    public static int sum(int first,int second) {
//        return first + second;
//    }


    public static double areaOfCircle(double r) {
        if (r > 0) return 3.141592 * r * r;
        else return 0;
    }

    public static String vegas(String original) {
        original += " something";
        return original;
    }
}

class Student {
    public static int studentCount = 0;
    String name;
    int age;

    Student(String name, int age) {
        studentCount++;
        this.name = name;
        this.age = age;
        //set up a student
    }
}
