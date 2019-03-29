package oop;

public class OOPApp {
    public static void main(String[] args) {
//        Programmer emp1 = new Programmer("Susan", "HR");
//        Employee emp2 = new SecurityGuard("Jane");
//
//        System.out.println(emp1.getName());
//        System.out.println(emp1.work());
//        System.out.println(emp2.getName());
//        System.out.println(emp2.work());
//
        Printable cat = new Cat("Fluffy");
        cat.print();
        Printable person = new Person("Bob");
        Printable securityGuard = new SecurityGuard("Bob");
        Printable[] printables = {cat, person, securityGuard};
        for (Printable i : printables) {
            i.print();

        }
    }
}
