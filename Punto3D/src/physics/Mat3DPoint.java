package physics;
import geom.*;
public class Mat3DPoint extends Punto3DCartesiano {
    private Mass m;
    public Mat3DPoint(Punto3D point, Mass m){
        super(point);
    }

    public Mass getM(){
        return m;
    }
}
