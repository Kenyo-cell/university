public class Main {

    public static void main(String[] args) {
        //Shape test
        Shape s1 = new Circle(20); // upcast
        Shape s2 = new Circle(12, "red", true);

        System.out.println(s1 + " area " + s1.getArea() +
                " perimeter " + s1.getPerimeter());

        s1 = new Rectangle(15, 20);
        s2 = new Rectangle(11, 8, "Blue", false);

        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1);

        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());

        Rectangle r1 = (Rectangle)s2; // downcast

        r1 = new Square(10);
        System.out.println(r1);
        System.out.println(r1.getArea());

        // test Movable

        Movable m1 = new MovableCircle(0, 0, 1, 1, 15);
        System.out.println(m1);
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

        m1 = new MovableRectangle(15, 15, 10, 10, 5, 5);
        System.out.println(m1);
        m1.moveRight();
        m1.moveUp();
        System.out.println(m1);
    }
}
