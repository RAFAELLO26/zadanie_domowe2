package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EllipseTest {

    @Test
    void getAreaOfEllipseTest() {
        double r1 = 9.0;
        double r2 = 7.5;
        Ellipse ell = new Ellipse(r1, r2);
        double areaOfEll = ell.getAreaOfEllipse();
        Assertions.assertEquals(212.0575, areaOfEll);
    }

    @Test
    void getPerimeterOfEllipseTest() {
        double r1 = 5.45;
        double r2 = 8.75;
        Ellipse ell = new Ellipse(r1, r2);
        double perimeterOfEll = ell.getPerimeterOfEllipse();
        Assertions.assertEquals(45.2213, perimeterOfEll);
    }

    @Test
    void roundTo4DecimalPlaceTest() {
        double test = Math.E;
        Ellipse ell = new Ellipse(test, test);
        double euler = ell.roundTo4DecimalPlace(test);
        double area = ell.getAreaOfEllipse();
        double perimeter = ell.getPerimeterOfEllipse();
        Assertions.assertEquals(2.7183, euler);
        Assertions.assertEquals(23.2134, area);
        Assertions.assertEquals(17.0795, perimeter);
    }
}