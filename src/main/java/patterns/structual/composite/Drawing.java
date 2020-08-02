package patterns.structual.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    @Override
    public void draw() {
        System.out.println("Drawing and it's shapes:");
        shapes.forEach(Shape::draw);
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
