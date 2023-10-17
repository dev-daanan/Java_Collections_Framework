package Comparable_and_Comparator.Problem7_Shape.src.main.java;

public abstract class Shape implements Comparable<Shape> {
    public abstract double area();

    @Override
    public int compareTo(Shape otherShape) {
        return Double.compare(this.area(), otherShape.area());
    }
}

