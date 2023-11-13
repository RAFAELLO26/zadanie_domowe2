package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void areaOfRectangleTest() {
        double len = 5.0;
        double wid = 7.6;
        Rectangle rect = new Rectangle(len, wid);
        double areaOfRect = rect.getAreaOfRectangle();
        Assertions.assertEquals(38.0, areaOfRect);
    }

    @Test
    void perimeterOfRectangleTest() {
        double len = 8.4;
        double wid = 9.6;
        Rectangle rect = new Rectangle(len, wid);
        double perimeterOfRect = rect.getPerimeterOfRectangle();
        Assertions.assertEquals(36.0, perimeterOfRect);
    }
}