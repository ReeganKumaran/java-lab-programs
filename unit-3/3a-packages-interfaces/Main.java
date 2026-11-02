import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Main {
    public static void main(String[] args) {
        try {
            Shape circle = new Circle(5);
            System.out.println("Circle:");
            System.out.println("Area: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());

            Shape rectangle = new Rectangle(4, 7);
            System.out.println("\nRectangle:");
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
