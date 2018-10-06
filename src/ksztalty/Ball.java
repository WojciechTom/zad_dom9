package ksztalty;

public class Ball extends Shape3D{
private double promien;

    public Ball( double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }
}
