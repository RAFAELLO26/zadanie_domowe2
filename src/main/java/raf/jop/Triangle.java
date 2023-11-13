package raf.jop;

public class Triangle {
    double side_a;
    double side_b;
    double side_c;
    double height;
    double angle;
    static int count;

    public Triangle (double a, double b, double ang) {
        this.side_a = a;
        this.side_b = b;
        this.angle = ang;
        this.height = this.getHeight();
        this.side_c = this.getSideC();
        count++;
        this.countMessage();
    }

    public double getHeight() {
        return this.roundTo4DecimalPlace(this.side_b * Math.sin(Math.toRadians(this.angle)));
    }

    public double getSideC() {
        double a2 = this.side_a - this.height/Math.tan(Math.toRadians(this.angle));
        return this.roundTo4DecimalPlace(Math.sqrt(a2*a2 + this.height*this.height));
    }

    public double getAreaOfTriangle() {
        return 0.5 * this.side_a * this.height;
    }

    public double getPerimeterOfTriangle() {
        return this.side_a + this.side_b + this.side_c;
    }

    public double roundTo4DecimalPlace(double value) {
        return Math.round(value * 10000.0) / 10000.0;
    }

    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" trójkat!");
    }
}
