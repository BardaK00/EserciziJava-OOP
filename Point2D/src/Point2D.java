
/**
 * Rappresenta un punto nel piano cartesiano con operazioni geometriche di utilità.
 */
public interface Point2D {

    /**
     * Restituisce la coordinata X del punto.
     */
    double getX();

    /**
     * Restituisce la coordinata Y del punto.
     */
    double getY();

    /**
     * Verifica se i tre punti forniti appartengono alla stessa retta.
     */
    boolean areAligned(Point2D a,Point2D b,Point2D c);

    /**
     * Determina se i segmenti AB e BC risultano perpendicolari fra loro.
     */
    boolean arePerpendicular(Point2D a,Point2D b,Point2D c);

    /**
     * Calcola la distanza euclidea tra due punti del piano.
     */
    double distance(Point2D a,Point2D b);

    /**
     * Controlla se i punti B e C si trovano alla stessa distanza dal punto A.
     */
    boolean isEquidistant(Point2D a, Point2D b, Point2D c);

    /**
     * Stabilisce se quattro punti formano i vertici di un quadrato.
     */
    boolean isSquare(Point2D a, Point2D b, Point2D c,Point2D d);

}
