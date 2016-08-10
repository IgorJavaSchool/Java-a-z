package yanevskyy.figure;

/**
 * Uses for actions with triangles.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Triangle {
    /*First point of triangle*/
    public Point a;
    /*Second point of triangle*/
    public Point b;
    /*Third point of triangle*/
    public Point c;
    /*It's triangle or not*/
    boolean valid;

    /**
     * Default constructor.
     * @param a First point.
     * @param b Second point.
     * @param c Third point.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        valid = false;
    }

    /**
     * Gets the area triangle of ​​Heron's formula.
     * @return Area.
     */
    public double area(){
        double sp;
        double areaTr;
        if (!isValid()) {
            System.out.println("Triangle with such data does not exist.");
            return 0;
        }
        sp = semiperimeter();
        areaTr = Math.sqrt(sp*(sp - getAb())*(sp - getBc())*(sp - getCa()));
        return areaTr;
    }

    /**
     * Gets the semiperimeter triangle
     * @return Result.
     */
    public double semiperimeter(){
        return (getAb() + getBc() + getCa()) / 2;
    }

    /**
     * Checking the validity of a triangle
     * @return is triangle or not.
     */
    public boolean isTriangleValid(){
        boolean result;
        if (a.equals(b) || b.equals(c) || a.equals(c))
            result = false;
        else if ((getAb() == (getBc() + getCa())))
            result = false;
        else if ((getBc() == (getAb() + getCa())))
            result = false;
        else if ((getCa() == (getAb() + getBc())))
            result =  false;
        else result = true;
        return result;
    }

    /**
     * Get the distance between A and B points.
     * @return distance.
     */
    public double getAb() {
        return a.distanceTo(b);
    }

    /**
     * Get the distance between B and C points.
     * @return distance.
     */
    public double getBc() {
        return b.distanceTo(c);
    }

    /**
     * Get the distance between C and A points.
     * @return distance.
     */
    public double getCa() {
        return c.distanceTo(a);
    }

    public boolean isValid() {
        return isTriangleValid();
    }
}
