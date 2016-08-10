package yanevskyy.figure;

/**
 * Uses for find the maximum distance between figure's points.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Figure implements DistancePoint {
    /*First point of figure*/
    public Point a;
    /*Second point of figure*/
    public Point b;
    /*Third point of figure*/
    public Point c;
    /*All points of figure*/
    Point[] points;

    /**
     * Default constructor.
     * @param a First point of figure.
     * @param b Second point of figure.
     * @param c Third point of figure.
     */
    public Figure(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        points = new Point[]{a, b, c};
    }

    /**
     * Find the maximum distance between figure's points
     * @param points Figure's points
     * @return Maximum distance.
     */
    @Override
    public double maxDistance(Point[] points){
        double max = 0;
        double distance;
        for (int i = 0; i < points.length; i++) {
            if (i == points.length - 1) {
                distance = points[0].distanceTo(points[points.length - 1]);
                if (max < distance)
                    max = distance;
            }
            else {
                distance = points[i].distanceTo(points[i + 1]);
                if (max < distance)
                    max = distance;
            }
        }
        return max;
    }
}
