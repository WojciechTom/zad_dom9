package ksztalty;

public class Line2D extends Shape2D {
private double dlugosc;

    public Line2D(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }
}
