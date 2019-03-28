package shapes;

public class Square extends Rectangle {
//    protected double side;

    public Square(double side) {
//        this.side = side;
        super(side,side);
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return 4 * this.length;
    }
}
