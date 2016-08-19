package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Arctg implements ActionStrategy {
    String key;

    public Arctg() {
        this.key = "arctg";
    }

    /**
     * Find arctangent.
     * @param scanner Input stream.
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        return Math.atan(firstNumber);
    }

    @Override
    public String getKey() {
        return key;
    }
}
