package oop;

public class SecurityGuard extends Employee {
    public SecurityGuard(String name) {
        super(name, "Security");
    }

    String work() {
        return "Hey, Keep Out!";
    }
}
