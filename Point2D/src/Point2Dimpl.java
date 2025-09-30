import java.awt.geom.Point2D;

public class Point2Dimpl extends Point2D {
    private double x=0.0;
    private double y=0.0;

    public Point2Dimpl(double x , double y){
        this.x = x;
        this.y = y;
    }

    public Point2Dimpl(){}

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {

    }

    @Override
    public String toString() {
        return "Point2Dimpl{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}