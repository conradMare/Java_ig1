package examples.Overriding.com.example;

public class ShapeDemo {

    public static void main(String args[]) {

        Shape figref;

        figref = new Shape(10, 10);
        System.out.println("Area is " + figref.calculateArea());

        figref = new Rectangle(9, 5);
        System.out.println("Area is " + figref.calculateArea());

        figref = new Triangle(10, 8);
        System.out.println("Area is " + figref.calculateArea());
    }
}
