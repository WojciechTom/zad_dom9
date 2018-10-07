package ksztalty;

public class LineCalc {

    double lineLength(Line2D line){
    return Math.pow((Math.pow((line.getaX()-line.getbX()),2) + Math.pow((line.getaY()-line.getbY()),2)),0.5);
    }
}
