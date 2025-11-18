import java.awt.geom.Point2D;

/**
 * Implementazione concreta di un punto 2D con alcune operazioni geometriche statiche.
 */
public class Point2Dimpl extends Point2D {

    private double x=0.0;
    private double y=0.0;

    /**
     * Verifica se tre punti risultano allineati calcolando l'area del parallelogramma.
     */
    public static boolean areAligned(Point2Dimpl a,Point2Dimpl b,Point2Dimpl c){
        return Math.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX())) < 1e-9;

    }

    /**
     * Controlla se gli spostamenti AB e BC sono ortogonali tramite il prodotto scalare.
     */
    public static boolean arePerpendicular(Point2Dimpl a,Point2Dimpl b,Point2Dimpl c){
        double x1 = a.getX();
        double x2=b.getX();
        double x3 = c.getX();
        double y1 = a.getY();
        double y2=b.getY();
        double y3 = c.getY();

        double prod = (x2 - x1) * (x3-x2) + (y2 - y1) * (y3-y2);
        return Math.abs(prod) < 1e-9;

    }

    /**
     * Calcola la distanza euclidea fra due punti.
     */
    public static double distance(Point2Dimpl a,Point2Dimpl b){
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx*dx + dy*dy);

    }

    /**
     * Verifica se i punti B e C sono alla stessa distanza dal punto A.
     */
    public static boolean isEquidistant(Point2Dimpl a, Point2Dimpl b, Point2Dimpl c){
        double eps = 1e-9;
        double distAC = distance(a,c);
        double distAB = distance(a,b);
        return Math.abs(distAC - distAB) < eps;

    }

    /**
     * Determina se quattro punti formano un quadrato controllando lati congruenti e angolo retto.
     */
    public static boolean isSquare(Point2Dimpl a, Point2Dimpl b, Point2Dimpl c,Point2Dimpl d){
        double segAB = distance(a,b);
        double segBC = distance(b,c);
        double segCD=distance(c,d);
        double segDA=distance(d,a);
        return Math.abs(segAB - segBC)<1e-9  && Math.abs(segBC - segCD)<1e-9  &&
                Math.abs(segCD - segDA)<1e-9  && arePerpendicular(a,b,c);
    }

}
