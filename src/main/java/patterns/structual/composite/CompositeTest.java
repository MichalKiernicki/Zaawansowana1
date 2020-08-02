package patterns.structual.composite;

import java.util.HashSet;
import java.util.Set;

public class CompositeTest {
    public static void main(String[] args) {

        Shape triangle1 = new Triangle();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape drawing1 = new Drawing();
        Shape drawing2 = new Drawing();

        ((Drawing) drawing1).addShape(triangle1);
        ((Drawing) drawing1).addShape(circle1);
        ((Drawing) drawing2).addShape(circle2);
        ((Drawing) drawing2).addShape(drawing1);


        drawing1.draw();
        System.out.println("====================");
        drawing2.draw();
        System.out.println("====================");
        circle1.draw();
        System.out.println("====================");
        Set<Shape> drawings = new HashSet<>();
        drawings.add(drawing1);
        drawings.add(drawing2);
        drawings.add(circle2);

        drawings.stream().forEach(Shape::draw);

    }
}
