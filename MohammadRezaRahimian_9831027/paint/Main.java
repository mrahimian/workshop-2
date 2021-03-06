package paint;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        Paint paint = new Paint();
        paint.addShapes(circle1);
        paint.addShapes(circle2);
        paint.addShapes(rect1);
        paint.addShapes(rect2);
        paint.addShapes(rect3);
        paint.addShapes(tri1);
        paint.addShapes(tri2);
        paint.drawAll();
        paint.printAll();
        if (circle2.equals(circle3)){
            System.out.println("circle 2 equals circle 3");
        }
    }
}
