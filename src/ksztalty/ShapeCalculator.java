package ksztalty;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape.getClass() == Rectangle.class) {
            return ((Rectangle) shape).getBokA() * ((Rectangle) shape).getBokB();
        } else {
            return Math.PI*Math.pow(((Circle)shape).getPromien(),2);
        }
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape.getClass() == Ball.class) {
            return 4.0/3.0 * Math.PI * Math.pow(((Ball)shape).getPromien(),3);
        } else {
            return Math.pow(((Cube)shape).getBokA(),3);
        }
    }
//    Override
//    public double circleArea(Circle circle)
//    return Math.PI*Math.pow(circle.getPromien(),2);}

//    @Override
//    public double rectangleArea(Rectangle rectangle) {
//        return rectangle.getBokA()*rectangle.getBokB();
//    }

//    @Override
//    public double ballVolume(Ball ball) {
//        return 4.0/3.0 * Math.PI * Math.pow(ball.getPromien(),3);
//    }
//
//    @Override
//    public double cubeVolume(Cube cube) {
//        return Math.pow(cube.getBokA(),3);
//    }

}
