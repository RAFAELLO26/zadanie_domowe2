package raf.jop;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze do obliczania pola powierzchni i obwodu!");
        Calculator calc = new Calculator();
        calc.choiceOperation();
    }

    Rectangle rect;
    Square squ;
    Ellipse ell;
    Circle circ;
    Triangle tri;
    EquilateralTriangle eqtri;

    void choiceOperation() {
        boolean calculate = true;
        Scanner scan = new Scanner(in);
        byte number;

        while (calculate) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1 - stwórz prostokąt");
            System.out.println("2 - stwórz kwadrat");
            System.out.println("3 - stworz elipsę");
            System.out.println("4 - stwórz koło");
            System.out.println("5 - stwórz dowolny trójkąt");
            System.out.println("6 - stwórz trójkąt równoboczny");
            System.out.println("7 - ZAKOŃCZ");
            number = scan.nextByte();

            while (number < 1 || number > 7) {
                System.out.println("Podałeś zły numer!");
                number = scan.nextByte();
            }

            switch (number) {
                case 1:
                    this.createRectangle();
                    break;
                case 2:
                    this.createSquare();
                    break;
                case 3:
                    this.createEllipse();
                    break;
                case 4:
                    this.createCircle();
                    break;
                case 5:
                    this.createTriangle();
                    break;
                case 6:
                    this.createEquiTriangle();
                    break;
                case 7:
                    calculate = false;
                    System.out.println("Do zobaczenia!");
            }
        }
    }

    void createRectangle() {
        double a, b;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość pierwszego boku prostokąta:");
        System.out.print(">>");
        a = Math.abs(scan1.nextDouble());
        System.out.println("Podaj długość drugiego boku prostokąta:");
        System.out.print(">>");
        b = Math.abs(scan1.nextDouble());
        rect = new Rectangle(a, b);
        System.out.println("Czy podać pole powierzchni prostokąta?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni prostokąta wynosi: " + this.rect.getAreaOfRectangle());
        System.out.println("Czy podać obwód prostokąta?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod prostokąta wynosi: " + this.rect.getPerimeterOfRectangle());
    }

    void createSquare() {
        double a;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość boku kwadratu:");
        System.out.print(">>");
        a = Math.abs(scan1.nextDouble());
        this.squ = new Square(a);
        System.out.println("Czy podać pole powierzchni kwadratu?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni kwadratu wynosi: " + this.squ.getAreaOfRectangle());
        System.out.println("Czy podać obwód kwadratu?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod kwadratu wynosi: " + this.squ.getPerimeterOfRectangle());
    }

    void createEllipse() {
        double r1, r2;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość pierwszego promienia elipsy:");
        System.out.print(">>");
        r1 = Math.abs(scan1.nextDouble());
        System.out.println("Podaj długość drugiego promienia elipsy:");
        System.out.print(">>");
        r2 = Math.abs(scan1.nextDouble());
        this.ell = new Ellipse(r1, r2);
        System.out.println("Czy podać pole powierzchni elipsy?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni elipsy wynosi: " + this.ell.getAreaOfEllipse());
        System.out.println("Czy podać obwód elipsy?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod elipsy wynosi: " + this.ell.getPerimeterOfEllipse());
    }

    void createCircle() {
        double r;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość promienia koła:");
        System.out.print(">>");
        r = Math.abs(scan1.nextDouble());
        this.circ = new Circle(r);
        System.out.println("Czy podać pole powierzchni koła?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni koła wynosi: " + this.circ.getAreaOfEllipse());
        System.out.println("Czy podać obwód koła?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod koła wynosi: " + this.circ.getPerimeterOfEllipse());
    }

    void createTriangle() {
        double a, b, ang;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość pierwszego boku trójkąta:");
        System.out.print(">>");
        a = Math.abs(scan1.nextDouble());
        System.out.println("Podaj długość drugiego boku trójkąta:");
        System.out.print(">>");
        b = Math.abs(scan1.nextDouble());
        System.out.println("Podaj wartość kąta między bokami [°]:");
        System.out.print(">>");
        ang = Math.abs(scan1.nextDouble());
        //założenie, że kąt w trójkącie ma max 179 stopni
        if (ang > 179.0)
            ang -= (((int) ang / 179) * 179);
        this.tri = new Triangle(a, b, ang);
        System.out.println("Czy podać pole powierzchni trójkąta?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni trójkąta wynosi: " + this.tri.getAreaOfTriangle());
        System.out.println("Czy podać obwód trójkąta?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod trójkąta wynosi: " + this.tri.getPerimeterOfTriangle());
    }

    void createEquiTriangle() {
        double a;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj długość boku trójkąta równobocznego:");
        System.out.print(">>");
        a = Math.abs(scan1.nextDouble());
        this.eqtri = new EquilateralTriangle(a);
        System.out.println("Czy podać pole powierzchni trójkąta równobocznego?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Pole powierzchni trójkąta równobocznego wynosi: " + this.eqtri.getAreaOfTriangle());
        System.out.println("Czy podać obwód trójkąta równobocznego?[y/n]");
        System.out.print(">>");
        if (scan1.next().charAt(0) == 'y')
            System.out.println("Obwod trójkąta równobocznego wynosi: " + this.eqtri.getPerimeterOfTriangle());
    }
}
