package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Div implements ActionStrategy {
    String key;

    public Div() {
        this.key = "/";
    }

    /**
     * Takes two numbers and the first numbers divided into second.
     * @param scanner
     * @return
     */
    @Override
    public double runAction(Scanner scanner) {
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("At 0 can not be divided.");
            return 0;
        }
    }

    @Override
    public String getKey() {
        return key;
    }
}
