package raf.jop;

public class Ellipse {
    double rad1;
    double rad2;
    static int count;

    public Ellipse(double r1, double r2) {
        this.rad1 = r1;
        this.rad2 = r2;
        count++;
        this.countMessage();
    }

    public double getAreaOfEllipse() {
        return this.roundTo4DecimalPlace(Math.PI * this.rad1 * this.rad2);
    }

    public double getPerimeterOfEllipse() {
        return this.roundTo4DecimalPlace(Math.PI * (1.5 * (this.rad1 + this.rad2) - Math.sqrt(this.rad1 * this.rad2)));
    }

    public double roundTo4DecimalPlace(double value) {
        return Math.round(value * 10000.0) / 10000.0;
    }

    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" elipsę!");
    }
}
