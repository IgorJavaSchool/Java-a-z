package yanevskyy.calculator;

public class Calculator {

    double result;

    void add(double first, double second){
        result = first + second;
    }

    void subtract(double first, double second){
        result = first - second;
    }

    void div(double first, double second){
        if(second != 0)
            result = first / second;
        else{ 
            System.out.println("At 0 can not be divided.");
            result = 0;
        }
    }

    void multiply(double first, double second){
        result = first * second;
    }
}