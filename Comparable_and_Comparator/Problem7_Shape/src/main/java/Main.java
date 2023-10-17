package Comparable_and_Comparator.Problem7_Shape.src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Rectangle(2, 7));
        shapes.add(new Circle(3.5));
        System.out.println("-".repeat(50));
        for (Shape shape : shapes) {System.out.println(shape.area());}
        // Using Comparable
        Collections.sort(shapes);
        System.out.println("-".repeat(50));
        for (Shape shape : shapes) {System.out.println(shape.area());}

        System.out.println("#".repeat(50));

        // Using Comparator for Circles
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5.5));
        circles.add(new Circle(3.5));
        circles.add(new Circle(7.5));
        circles.add(new Circle(12.5));
        circles.add(new Circle(1.5));
        circles.add(new Circle(0.5));

        System.out.println("-".repeat(50));
        for (Circle circle : circles) {System.out.println(circle.getRadius());}

        circles.sort(new CircleComparator());

        System.out.println("-".repeat(50));
        for (Circle circle : circles) {System.out.println(circle.getRadius());}
    }
}
