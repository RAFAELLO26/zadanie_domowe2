package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getHeightTest() {
        double a = 5.0;
        double b = 5.0;
        double ang = 45.0;
        Triangle tri = new Triangle(a, b, ang);
        double h = tri.getHeight();
        Assertions.assertEquals(3.5355, h);
    }

    @Test
    void getSideCTest() {
        double a = 5.0;
        double b = 4.0;
        double ang = 45.0;
        Triangle tri = new Triangle(a, b, ang);
        double c = tri.getSideC();
        Assertions.assertEquals(3.5659, c);
    }

    @Test
    void getAreaOfTriangleTest() {
        double a = 5.0;
        double b = 4.0;
        double ang = 30.0;
        Triangle tri = new Triangle(a, b, ang);
        double area = tri.getAreaOfTriangle();
        Assertions.assertEquals(5.0, area);
    }

    @Test
    void getPerimeterOfTriangleTest() {
        double a = 5.0;
        double b = 7.0711;      //5*Math.sqrt(2)
        double ang = 45.0;
        Triangle tri = new Triangle(a, b, ang);
        double perimeter = tri.getPerimeterOfTriangle();
        Assertions.assertEquals(17.0711, perimeter);
    }
}