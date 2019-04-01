package oop;

import shapes.Shape;
import shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPractice {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        List<String> stringCollection = new ArrayList<>();

        System.out.println(stringCollection.isEmpty());
        List<Square> squares;
        List<Shape> shapes;

        stringArray[0] = "Hello";
//        stringCollection.get(i);
        stringCollection.add("Hello");
        System.out.println(stringCollection.isEmpty());
        stringCollection.add("Hello");
        stringCollection.add("Hello");
        stringCollection.add("Hello");
        stringCollection.add("Hello");
        stringCollection.add(2,"World");
        stringCollection.add(3,"Codeup");
        System.out.println(stringCollection);

        for (String str : stringCollection) {
            System.out.println(str);

        }
        System.out.println(stringCollection.contains("World"));
        stringCollection.remove("World");
        System.out.println(stringCollection.contains("World"));
        System.out.println(stringCollection);

        stringCollection.clear();
        System.out.println(stringCollection.isEmpty());


        List<Student> zion = new ArrayList<>();
        zion.add(new Student("student1"));
        zion.add(new Student("student2"));

        List<Student> zion2 = new ArrayList<>();
        zion2.addAll(zion);

    }

}
