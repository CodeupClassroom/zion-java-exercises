package oop;

public abstract class Employee implements Printable {
    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        System.out.println("Here in Employee.getName()");
        return name;
    }
    public String getDepartment() {
        return department;
    }

//    abstract String work(String input);
    abstract String work();
}
