package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Add implements ActionStrategy {
    String key;

    public Add() {
        this.key = "+";
    }

    /**
     * Takes two numbers and adds them.
     * @param scanner Input stream.
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        return firstNumber + secondNumber;
    }

    @Override
    public String getKey() {
        return key;
    }
}
