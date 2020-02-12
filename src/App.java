import shape.Circle;
import shape.Rectangle;
import shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Shape> listShapes1 = new ArrayList<>();
    public static List<Shape> listShapes2 = new ArrayList<>();


    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setWidth(10);
        rect1.setHeight(5);
        rect1.setColor("red");

        Circle circle1 = new Circle();
        circle1.setDiameter(12);
        circle1.setColor("green");

        listShapes1.add(rect1);
        listShapes1.add(circle1);

        listShapes2.add(rect1.cloneShape());
        listShapes2.add(circle1.cloneShape());

        for (Shape sh : listShapes1) {
            System.out.println(sh.getType());
        }

        System.out.println("");

        for (Shape sh : listShapes2) {
            System.out.println(sh.getType());
        }

    }

}
