package shapes;

import java.sql.ResultSet;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public Rectangle() { }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }


}
