package ksztalty;

import javax.sound.sampled.Line;

public class CalculatorTest {
    public static void main(String[] args) {
        Line2D linia = new Line2D(4.5);
        Circle koło = new Circle(4.7);
        Rectangle prostokat = new Rectangle(3,6);
        Ball kula = new Ball(9);
        Cube kostka = new Cube(2);

        ShapeCalculator kalkulator = new ShapeCalculator();

        System.out.println("Długość lini = " + kalkulator.lineLength(linia));
        System.out.println("Pole koła = " + kalkulator.circleArea(koło));
        System.out.println("Pole prostokąta = " + kalkulator.rectangleArea(prostokat));
        System.out.println("Objętość kuli  = " + kalkulator.ballVolume(kula));
        System.out.println("Objętość sześcianu  = " + kalkulator.cubeVolume(kostka));


    }
}
