package oop;

public class Child extends Parent {

    public String getInheritedString() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.inheritedMethod();
        System.out.printf(child.getInheritedString());
    }
}
