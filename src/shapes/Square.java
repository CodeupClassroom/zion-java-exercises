package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
    ////    protected double side;
//
//    public Square(double side) {
////        this.side = side;
//        super(side,side);
//    }
//
    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return 4 * this.length;
    }
}
