package geom;

public interface Punto3D {
    double getX();
    double getY();
    double getZ();

    //METODO DI DEFAULT PER LA DISTANZA TRA 2 PUNTI
    default double distance(Punto3D p,Punto3D p2){
        double dx = p.getX() - p2.getX();
        double dy = p.getY() - p2.getY();
        double dz = p.getZ() - p2.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
