package Comparable_and_Comparator.Problem7_Shape.src.main.java;

import java.util.Comparator;

class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}
