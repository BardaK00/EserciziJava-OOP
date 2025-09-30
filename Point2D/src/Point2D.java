
public interface Point2D {
    double getX();
    double getY();
    boolean areAligned(Point2D a,Point2D b,Point2D c);
    boolean arePerpendicular(Point2D a,Point2D b,Point2D c);
    double distance(Point2D a,Point2D b);
    boolean isEquidistant(Point2D a, Point2D b, Point2D c);
    boolean isSquare(Point2D a, Point2D b, Point2D c,Point2D d);

}

