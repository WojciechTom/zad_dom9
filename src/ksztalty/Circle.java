package ksztalty;

public class Circle extends GeometricShape{
private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }
}
