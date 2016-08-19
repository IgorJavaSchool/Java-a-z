package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Subtract implements ActionStrategy {
    String key;

    public Subtract() {
        this.key = "-";
    }

    /**
     * Takes two numbers and from the first number subtracts the second number.
     * @param scanner
     * @return
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        return firstNumber - secondNumber;
    }

    @Override
    public String getKey() {
        return key;
    }
}
