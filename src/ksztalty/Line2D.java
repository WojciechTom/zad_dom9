package ksztalty;

public class Line2D extends Shape2D {
private double aX;
private double aY;
private double bX;
private double bY;


    public Line2D(double aX, double aY, double bX, double bY ) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
    }

    public double getaX() {
        return aX;
    }

    public void setaX(double aX) {
        this.aX = aX;
    }

    public double getaY() {
        return aY;
    }

    public void setaY(double aY) {
        this.aY = aY;
    }

    public double getbX() {
        return bX;
    }

    public void setbX(double bX) {
        this.bX = bX;
    }

    public double getbY() {
        return bY;
    }

    public void setbY(double bY) {
        this.bY = bY;
    }
}
