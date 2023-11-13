package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void getAreaOfEllipseTest() {
        double r = 11.11;
        Circle circ = new Circle(r);
        double areaOfCirc = circ.getAreaOfEllipse();
        Assertions.assertEquals(387.7734, areaOfCirc);
    }

    @Test
    void getPerimeterOfEllipseTest() {
        double r = 8.4;
        Circle circ = new Circle(r);
        double perimeterOfEll = circ.getPerimeterOfEllipse();
        Assertions.assertEquals(52.7788, perimeterOfEll);
    }
}