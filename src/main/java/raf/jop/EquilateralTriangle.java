package raf.jop;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double a) {
        super(a, a, 60.0);
    }

    @Override
    public double getSideC() {
        return this.side_a;
    }

    @Override
    public double getAreaOfTriangle() {
        return this.roundTo4DecimalPlace(this.side_a*this.side_a*Math.sqrt(3.0)/4.0);
    }

    @Override
    public double getPerimeterOfTriangle() {
        return this.roundTo4DecimalPlace(3.0*this.side_a);
    }

    @Override
    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" trójkat, który jest trójkątem równobocznym!");
    }
}
