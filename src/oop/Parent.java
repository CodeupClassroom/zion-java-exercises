package oop;

import movies.Movie;
//import movies.MoviesArray;

public class Parent {
    public String inheritedString;

//    public Parent(String str) {
//        this.inheritedString = str;
//    }

    public Parent() {
        this.inheritedString = "Parent";
    }

    public void inheritedMethod() {
        System.out.printf("Hello from %s",
                this.inheritedString );
    }

    public String getInheritedString() {
        return inheritedString;
    }

    public static void main(String[] args) {
//        Parent parent = new Parent("Parent");
        Parent parent = new Parent();
        parent.inheritedMethod();
//        Movie[] movies =  MoviesArray.findAll();
    }

    // A class is a description of what things of that type
    // have in common. Properties (fields) and behaviors
    // (methods). Instances of a class have their own values
    // for properties (i.e. this.name = "My Name") and the
    // behavior, although defined on the class just like
    // properties, are specific to and affect themselves

    // public // protected // (package) // private //
}
