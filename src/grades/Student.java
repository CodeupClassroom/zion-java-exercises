package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int i = 0; i<this.grades.size(); i++) {
            total += this.grades.get(i);
//        for (Integer grade : this.grades) {
//            total += grade;
        }
        return Math.round(total / this.grades.size());
    }

    public static void main(String[] args) {
        Student dwight = new Student("Dwight");
        dwight.addGrade(90);
        dwight.addGrade(85);
        dwight.addGrade(400);
        System.out.println(dwight.getGradeAverage());
    }

}
