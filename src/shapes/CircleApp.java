package shapes;

import util.Input;

import javax.xml.transform.TransformerException;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter a radius");
        Input in = new Input();

        double radius = 0;
        try {
            radius = in.getDouble();
        } catch (TransformerException te) {
            System.out.println("I don't know what to do");
        }
        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }


}
