package yanevskyy.calculator.actions;

import java.util.Scanner;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public interface ActionStrategy {
    double runAction(Scanner scanner);
    String getKey();
}
