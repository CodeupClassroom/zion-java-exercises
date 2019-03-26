package oop;

public class Pug {

    public static int noOfpugs = 1000;
    public String name = "Pug Doe";
    public int age;
    public boolean isCute;

    public String grunt() {
        return name;
    }


    @Override
    public String toString() {
        return "Pug{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }

    public static Pug returnYoungestPug(Pug p1, Pug p2) {
        return (p1.age < p2.age) ? p1 : p2;
    }

    public static void main(String[] args) {
        Pug pug1 = new Pug();
        pug1.name = "Fred";
        pug1.age = 3;
        pug1.isCute = false;

//        System.out.println(pug1.toString());

        Pug pug2 = new Pug();
        pug2.name = "Bowser";
        pug2.age = 5;
        pug2.isCute = true;


        System.out.println(pug1.grunt());


    }

}
