package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Tg implements ActionStrategy {
    String key;

    public Tg() {
        this.key = "tg";
    }

    /**
     * Find tangent.
     * @param scanner Input stream.
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        return Math.tan(firstNumber);
    }

    @Override
    public String getKey() {
        return key;
    }
}
