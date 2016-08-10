package yanevskyy.figure;

/**
 * Uses to work with points in the coordinate system.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Point {
    /*First point*/
    final double x;
    /*Second point*/
    final double y;

    /**
     /**
     * Default constructor.
     * @param x First point.
     * @param y Second point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    /** Get the distance between two points.*/
    /**
     * Gets the distance between two points.
     * @param point Point for which need find distance.
     * @return Distance.
     */
    public double distanceTo(Point point){
        double distance;
        distance = Math.sqrt(Math.pow(point.getX() - this.getX(), 2) +
                Math.pow(point.getY() - this.getY(), 2));
        return distance;
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
