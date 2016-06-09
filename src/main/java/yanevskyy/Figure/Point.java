package yanevskyy.figure;

/**
 * Created by MM on 17.05.2016.
 */
public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Get the distance between two points.*/

    public double distanceTo(Point point){
        double distance;
        distance = Math.sqrt(Math.pow(point.getX() - this.getX(), 2) +
                             Math.pow(point.getY() - this.getY(), 2));
        return distance;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (int) x;
        result = result * prime + (int) y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Point point = (Point) obj;
        if (getX() != point.getX())
            return false;
        if (getY() != point.getY())
            return false;
        return true;
    }
}
