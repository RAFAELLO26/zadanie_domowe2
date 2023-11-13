package raf.jop;

public class Square  extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void countMessage() {
        System.out.println("Stworzyłeś "+count+" prostokąt, który jest kwadratem!");
    }
}
