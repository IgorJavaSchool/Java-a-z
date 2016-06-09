package yanevskyy.figure;

/**
 * Created by MM on 17.05.2016.
 */
public class Figure {
    public Point a;
    public Point b;
    public Point c;
    Point[] points;

    public Figure(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        points = new Point[]{a, b, c};
    }

    /**Find the maximum distance between figure's points */

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
