package oop;

class Student {
    public String name;
    public String cohort;

    public Student() {

    }

    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }
    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Fred", "Zion");
        Student s2 = new Student("Sam");
        Student s3 = new Student("Cindy", "Lassen");

    }
}