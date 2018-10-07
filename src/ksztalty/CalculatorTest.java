package ksztalty;

import javax.sound.sampled.Line;
import javax.swing.plaf.metal.MetalIconFactory;
import java.util.concurrent.CyclicBarrier;

public class CalculatorTest {
    public static void main(String[] args) {
        Line2D linia = new Line2D(0,5,0,0);
        Circle koło = new Circle(4.7);
        Rectangle prostokat = new Rectangle(3,6);
        Ball kula = new Ball(9);
        Cube kostka = new Cube(2);

        ShapeCalculator kalkulator = new ShapeCalculator();

        System.out.println("Długość lini = " + kalkulator.lineLength(linia));
        //System.out.println("Pole koła = " + kalkulator.circleArea(koło));
        //System.out.println("Pole prostokąta = " + kalkulator.rectangleArea(prostokat));
        System.out.println("Pole koła = " + kalkulator.shapeArea(koło));
        System.out.println("Pole prostokąta = " + kalkulator.shapeArea(prostokat));
        //System.out.println("Objętość kuli  = " + kalkulator.BallVolume(kula));
        //System.out.println("Objętość sześcianu  = " + kalkulator.CubeVolume(kostka));
        System.out.println("Objętość kuli  = " + kalkulator.volume(kula));
        System.out.println("Objętość sześcianu  = " + kalkulator.volume(kostka));


        Shape[] tablica = new Shape[5];
        tablica[0] = new Line2D(0,5,0,0);
        tablica[1] = new Circle(8);
        tablica[2] = new Rectangle(5,2);
        tablica[3] = new Ball(7);
        tablica[4] = new Cube(12);


        for (int i=0;i<tablica.length;i++){
            if (tablica[i].getClass() == Line2D.class) {
                System.out.println("Odcinek wyznaczony przez wspołrzedne[" + ((Line2D)tablica[i]).getaX() + "," + ((Line2D)tablica[i]).getaY() + "][" + ((Line2D)tablica[i]).getbX() + "," + ((Line2D)tablica[i]).getbY() + "] ma długość " + kalkulator.lineLength((Line2D)tablica[i]) );
            } else if (tablica[i].getClass() == Rectangle.class){
                System.out.println("Prostokąt o długościach boków " + ((Rectangle)tablica[i]).getBokA() + " i " + ((Rectangle)tablica[i]).getBokB() + " ma pole, które wynosi "+ kalkulator.shapeArea((GeometricShape)tablica[i])) ;
            } else if(tablica[i].getClass() == Circle.class) {
                System.out.println("Koło o długosci promienia " + ((Circle)tablica[i]).getPromien() + " ma objętość " + kalkulator.shapeArea((GeometricShape)tablica[i]));
            } else if (tablica[i].getClass() == Ball.class){
                System.out.println("Kula o długosci promienia "+ ((Ball)tablica[i]).getPromien() + " ma objętość " + kalkulator.volume((Shape3D)tablica[i]));
            } else {
                System.out.println("Sześcian o długości krawędzi wynoszącej " + ((Cube)tablica[i]).getBokA() + " ma pjemność " + kalkulator.volume(((Shape3D)tablica[i])));
            }
        }
    }
}
