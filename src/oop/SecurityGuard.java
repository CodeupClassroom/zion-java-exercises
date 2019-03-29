package oop;

public class SecurityGuard extends Employee {
    public SecurityGuard(String name) {
        super(name, "Security");
    }

    String work() {
        return "Hey, Keep Out!";
    }

    public void print() {
        System.out.printf("Here is your parking pass. Have a nice day.");
    }
}
