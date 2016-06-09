package yanevskyy.figure;

/**
 * Created by MM on 17.05.2016.
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;
    boolean valid;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        valid = false;
    }

    /**Get the area triangle of ​​Heron's formula.*/

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

    /**Get the semiperimeter triangle*/

    public double semiperimeter(){
        return (getAb() + getBc() + getCa()) / 2;
    }

    /**Checking the validity of a triangle*/

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

    /**Get the distance between two points*/

    public double getAb() {
        return a.distanceTo(b);
    }

    public double getBc() {
        return b.distanceTo(c);
    }

    public double getCa() {
        return c.distanceTo(a);
    }

    public boolean isValid() {
        return isTriangleValid();
    }
}
