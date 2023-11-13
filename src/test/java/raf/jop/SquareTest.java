package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void areaOfSquareTest() {
        double a = 12;
        Square squ = new Square(a);
        double areaOfSqu = squ.getAreaOfRectangle();
        Assertions.assertEquals(144.0, areaOfSqu);
    }

    @Test
    void perimeterOfSqu() {
        double a = 25.5;
        Square squ = new Square(a);
        double perimeterOfSqu = squ.getPerimeterOfRectangle();
        Assertions.assertEquals(102.0, perimeterOfSqu);
    }
}