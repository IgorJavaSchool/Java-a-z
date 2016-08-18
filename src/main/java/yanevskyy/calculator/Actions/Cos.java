package yanevskyy.calculator.Actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Cos implements ActionStrategy {
    String key;

    public Cos() {
        this.key = "cos";
    }

    /**
     * Find cosine.
     * @param scanner Input stream.
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        return Math.cos(firstNumber);
    }

    @Override
    public String getKey() {
        return key;
    }
}
