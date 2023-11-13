package raf.jop;

public class Circle extends Ellipse {
    public Circle(double rad) {
        super(rad, rad);
    }

    @Override
    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" elipsę, która jest kołem!");
    }
}
