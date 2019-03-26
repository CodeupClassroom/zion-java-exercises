package oop;

public class PostTest {

    public static void main(String[] args) {
        Post p = new Post(
                "My Awesome Post",
                "01/01/1999",
                2,
                "Blah blah");


        System.out.println(p.getThatTitle());
        p.changeThatTitle("NEW TITLE");
        System.out.println(p.getThatTitle());

    }



}
