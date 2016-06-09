package yanevskyy.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Y on 16.05.2016.
 */
public class CalculatorTest {
    @Test
    public void whenGetTwoNumbersShouldAddTheir(){
        Calculator calculator = new Calculator();
        double firstNumber = 1;
        double secondNumber = 1;
        double result;
        double checked = 2.0;

        calculator.add(firstNumber, secondNumber);
        result = calculator.result;

        Assert.assertThat(result, is(checked));
    }

    @Test
    public void whenGetTwoNumbersShouldSubtractTheir(){
        Calculator calculator = new Calculator();
        double firstNumber = 2;
        double secondNumber = 1;
        double result;
        double checked = 1.0;

        calculator.subtract(firstNumber, secondNumber);
        result = calculator.result;

        Assert.assertThat(result, is(checked));
    }

    @Test
    public void whenGetTwoNumbersShouldDivTheir(){
        Calculator calculator = new Calculator();
        double firstNumber = 9;
        double secondNumber = 0;
        double result;
        double checked = 0;

        calculator.div(firstNumber, secondNumber);
        result = calculator.result;

        Assert.assertThat(result, is(checked));
    }

    @Test
    public void whenGetTwoNumbersShouldMultiplyTheir(){
        Calculator calculator = new Calculator();
        double firstNumber = 2;
        double secondNumber = 3;
        double result;
        double checked = 6;

        calculator.multiply(firstNumber, secondNumber);
        result = calculator.result;

        Assert.assertThat(result, is(checked));
    }
}