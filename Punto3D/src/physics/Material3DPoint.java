package physics;
import geom.*;

public class Material3DPoint {
    private Punto3DCartesiano punto;
    private Mass m;

    public Material3DPoint(Punto3DCartesiano p, Mass m){
        if (p!= null && m!=null){
            this.punto = p;
            this.m= m;
        }
        else{
            //todo
        }
    }

    public Material3DPoint(double x,double y,double z,double m){
        this.punto = new Punto3DCartesiano(x,y,z);
        this.m = new Mass(m);
    }

    public Punto3DCartesiano getPunto(){
        return this.punto;
    }

    public Mass getMassa(){
        return this.m;
    }

    public static Punto3D getBarycenter(Material3DPoint[] list){
        double sumx = 0;
        double sumy = 0;
        double sumz = 0;
        double tm = 0;

        for (Material3DPoint point:list){
            sumx += point.getPunto().getX() * point.getMassa().getM();
            sumy += point.getPunto().getY() * point.getMassa().getM();
            sumz += point.getPunto().getZ() * point.getMassa().getM();
            tm += point.getMassa().getM();

        }
        return new Punto3DCartesiano(sumx/tm,sumy/tm,sumz/tm);
    }
}
