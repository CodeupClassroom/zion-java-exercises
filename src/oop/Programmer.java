package oop;

public class Programmer extends Employee {//} implements WritesCode, Printable{

    public Programmer(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "<h2>Hello World</h2>";
    }
    public String work(String input) {
        return work();
    }


    public void print() {
        System.out.println("Hello world");
    }

    public String code() {
        return "sout(\"Hello world\")";
    }
}
