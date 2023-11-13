package raf.jop;

public class Rectangle {
    double len;
    double wid;
    static int count;

    public Rectangle(double l, double w) {
        this.len = l;
        this.wid = w;
        count++;
        this.countMessage();
    }

    public double getAreaOfRectangle() {
        return this.len * this.wid;
    }

    public double getPerimeterOfRectangle() {
        return 2*this.len + 2*this.wid;
    }

    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" prostokąt!");
    }
}
