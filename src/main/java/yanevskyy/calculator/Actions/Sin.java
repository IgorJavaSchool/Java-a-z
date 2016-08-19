package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Sin implements ActionStrategy {
    String key;

    public Sin() {
        this.key = "sin";
    }

    /**
     * Find sinus.
     * @param scanner Input stream.
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        return Math.sin(firstNumber);
    }

    @Override
    public String getKey() {
        return key;
    }
}
