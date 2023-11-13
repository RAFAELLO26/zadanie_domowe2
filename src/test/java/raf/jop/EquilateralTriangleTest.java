package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EquilateralTriangleTest {
    @Test
    void getHeightTest() {
        double a = 5.0;
        EquilateralTriangle eqtri = new EquilateralTriangle(a);
        double h = eqtri.getHeight();
        Assertions.assertEquals(4.3301, h);
    }

    @Test
    void getSideCTest() {
        double a = 9.0;
        EquilateralTriangle eqtri = new EquilateralTriangle(a);
        double c = eqtri.getSideC();
        Assertions.assertEquals(9.0, c);
    }

    @Test
    void getAreaOfTriangleTest() {
        double a = 6.5;
        EquilateralTriangle eqtri = new EquilateralTriangle(a);
        double area = eqtri.getAreaOfTriangle();
        Assertions.assertEquals(18.2948, area);
    }

    @Test
    void getPerimeterOfTriangleTest() {
        double a = 12.45;
        EquilateralTriangle eqtri = new EquilateralTriangle(a);
        double perimeter = eqtri.getPerimeterOfTriangle();
        Assertions.assertEquals(37.35, perimeter);
    }
}