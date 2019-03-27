package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter a radius");
        Input in = new Input();
        double radius = in.getDouble();
        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }


}
