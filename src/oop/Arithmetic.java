package oop;

class Arithmetic {
    // static property
    public static double pi = 3.14159;
    // static methods
    public static int add(int x, int y) {
        return x + y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        System.out.println(Arithmetic.pi); // 3.14159
        System.out.println(Arithmetic.add(5, 5));      // 10
        System.out.println(Arithmetic.multiply(5, 5)); // 25
    }
}
