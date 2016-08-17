package yanevskyy.calculator;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class EngineeringCalculator {

    /**
     * Result actions.
     */
    private double result;


    /**
     * Find sinus.
     */
    public void sinFind(double decimal){
        setResult(Math.sin(decimal));
    }

    /**
     * Find cosine.
     */
    public void cosFind(double decimal){
        setResult(Math.cos(decimal));
    }

    /**
     * Find tangent.
     */
    public void tgFind(double decimal){
        setResult(Math.tan(decimal));
    }

    /**
     * Find arctangent.
     */
    public void artgFind(double decimal){
        setResult(Math.atan(decimal));
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
