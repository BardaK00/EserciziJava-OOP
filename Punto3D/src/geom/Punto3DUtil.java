package geom;

public class Punto3DUtil {
    public static double getMiddleX(Punto3D[] list){
        double sum = 0.0;
        for(int i = 0;i<list.length;i++){
            sum += list[i].getX();
        }
        return sum/list.length;
    }
    public static double getMiddleY(Punto3D[] list){
        double sum = 0.0;
        for(int i = 0;i<list.length;i++){
            sum += list[i].getY();
        }
        return sum/list.length;
    }

    public static double getMiddleZ(Punto3D[] list) {
        double sum = 0.0;
        for(int i = 0;i<list.length;i++){
            sum += list[i].getZ();
        }
        return sum/list.length;
    }

    public static Punto3D getMiddlePoint(Punto3D[] list){
        double x = getMiddleX(list);
        double y = getMiddleY(list);
        double z = getMiddleZ(list);
        return new Punto3DCartesiano(x,y,z);
    }
}
