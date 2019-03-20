public class HelloWorld {
    public static void main(String[] args) {
//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 1234;
        System.out.println(myFavoriteNumber);

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Happy Wednesday!";
        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?
//        String myString = 'H'; // incompatible types
//        System.out.println(myString);
//
//        Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159; // incompatible types
//        System.out.println(myString);
//
//        Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber); //not initialized

//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14; // incompatible types
//        System.out.println(myNumber); //not initialized
//
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L; // incompatible types
//        System.out.println(myNumber);
//
//        Change your code to assign the value 123 to myNumber.
//        long myNumber = 123; // incompatible types
//        System.out.println(myNumber);
//
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber =  3.14f; // incompatible types, req float, found double
        System.out.println(myNumber);

//
//                Copy and paste the following code blocks one at a time and execute them
//
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//        Try to create a variable named class. What happens?
//        String class = "Does this work?";
//        Object is the most generic type in Java. You can assign any value to a variable of type Object.
//        What do you think will happen when the following code is run?
//
//
//        String theNumberThree = "3";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from this code block?
//
//
//        int three = (int) "3";
//        What are the two different types of errors we are observing?
//
//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        What happens if you increment a numeric variable past the type's capacity?
//
        int ourNumber = 12801;
        byte littleNumber = (byte) ourNumber;
        System.out.println(littleNumber);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }
}
