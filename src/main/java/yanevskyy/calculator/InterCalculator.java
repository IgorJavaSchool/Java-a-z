package yanevskyy.calculator;

import yanevskyy.calculator.actions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Uses for work with console and has new functions.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculator  {
    private Scanner scanner;
    private PrintConsole printConsole;
    private List<ActionStrategy> actions;
    private double result;

    /**
     * Default constructor
     */
    public InterCalculator() {
        this.scanner = new Scanner(System.in);
        this.printConsole = new PrintConsole();
        this.actions = new ArrayList<>();
        this.result = 0;
    }

    /**
     * Read from console user's message and fill first and second numbers.
     */
    public void selectActions(){
        String action;
        fillStrategy();
        printConsole.printMenu();
        action = scanner.next();
        for (ActionStrategy actionStrategy : this.actions) {
            if (action.equals(actionStrategy.getKey())) {
                this.result = actionStrategy.runAction(scanner);
                printConsole.writer(String.valueOf(result));
            }
        }
    }

    /**
     * Fills list with strategy
     */
    public void fillStrategy(){
        this.actions.add(new Add());
        this.actions.add(new Subtract());
        this.actions.add(new Div());
        this.actions.add(new Multiply());
        this.actions.add(new Sin());
        this.actions.add(new Cos());
        this.actions.add(new Tg());
        this.actions.add(new Arctg());
    }

    public static void main(String[] args) {
        InterCalculator interCalculator = new InterCalculator();
        interCalculator.selectActions();
    }
}
