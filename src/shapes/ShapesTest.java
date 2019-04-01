package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4.0, 5.0);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5.0);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape;
        myShape = new Square(7.0);
        System.out.printf("This shape has Area=%s%nAnd Perimeter=%s%n",
                myShape.getArea(), myShape.getPerimeter());
//        System.out.println(((Square) myShape).getWidth());
        myShape = new Rectangle(5.0,10.0);
        System.out.printf("This shape has Area=%s%nAnd Perimeter=%s%n",
                myShape.getArea(), myShape.getPerimeter());
//        System.out.println(((Rectangle) myShape).getLength());
    }

    //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
    // IntelliJ automatically added a cast to Rectangle or Square
    // because myShape is a Measurable and a Measurable doesn't have a getLength method
}
