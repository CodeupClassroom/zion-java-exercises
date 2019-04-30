package oop;

import shapes.Shape;
import shapes.Square;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        Map<Integer, String> friends = new HashMap<>();

        friends.put(78, "Fred");
        friends.put(95,"Macaroni");
        friends.put(55, "Pasta");
        friends.replace(55, "Fettuccine");
        System.out.println(friends.get(95));
        System.out.println(friends);
        if (friends.containsKey(55))
            System.out.println("friend 55 is " + friends.get(55));
        friends.remove(88);
        System.out.println(friends);
        friends.clear();
        System.out.println(friends);


        List<Student> students = new ArrayList<>();
        students.add(new Student("zion"));
        // .....

        String hello = "hello";



    }

}
