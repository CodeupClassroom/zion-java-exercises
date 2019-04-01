package oop;

public class Person implements Printable {
    public static long worldPopulation = 7_500_000_000L; // class property
    public String name;                                  // instance property
    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("Hello, my name is %s%n", this.name);
    }

    public static void main(String[] args) {

        Person theBestDrummerAlive = new Person("name");
        theBestDrummerAlive.name = "Neil Peart";

        Person.worldPopulation += 1; // accessing a static property

//        // this also works, but is usually not a good idea
        System.out.println(Person.worldPopulation); // 7500000001

//        // DONT DO THIS, it will not compile
//        System.out.println(Person.name);
    }
}
