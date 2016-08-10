package yanevskyy.calculator;

/**
 * Imitation calculator.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Calculator {

    /**
     * Result actions.
     */
    private double result;

    /**
     * Takes two numbers and adds them.
     * @param first First number.
     * @param second Second number.
     */
    void add(double first, double second){
        result = first + second;
    }

    /**
     * Takes two numbers and from the first number subtracts the second number.
     * @param first First number.
     * @param second Second number.
     */
    void subtract(double first, double second){
        result = first - second;
    }

    /**
     * Takes two numbers and the first numbers divided into second.
     * @param first First number.
     * @param second Second number.
     */
    void div(double first, double second){
        if(second != 0)
            result = first / second;
        else{ 
            System.out.println("At 0 can not be divided.");
            result = 0;
        }
    }

    /**
     * Takes two numbers and the first numbers multiplied by to second.
     * @param first First number.
     * @param second Second number.
     */
    void multiply(double first, double second){
        result = first * second;
    }

    public double getResult() {
        return result;
    }
}