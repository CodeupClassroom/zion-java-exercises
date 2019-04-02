package oop;

public class Child extends Parent {

    //@Override // Method does not override method from its superclass getInheritedString()
    public String getInheritedString(String input) {
        return "Hello World";
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.inheritedMethod();
        System.out.printf(child.getInheritedString());
    }
}
