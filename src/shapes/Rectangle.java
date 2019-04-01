package shapes;

import java.sql.ResultSet;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    //    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    public Rectangle() { }
//
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }
// Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
// getPerimeter is required in any class that implements Measurable
}
