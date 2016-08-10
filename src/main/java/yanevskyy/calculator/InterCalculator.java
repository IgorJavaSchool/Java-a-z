package yanevskyy.calculator;

import java.util.Scanner;

/**
 * Uses for work with console and has new functions.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculator extends Calculator implements SuperCalculate {
    private double firstNumber;
    private double secondNumber;
    /*Stores result*/
    private double memory;
    private String actionMemory;
    private Scanner scanner;
    private ConsoleHelper consoleHelper;
    private boolean active;

    /**
     * Default constructor
     */
    public InterCalculator() {
        this.scanner = new Scanner(System.in);
        this.consoleHelper = new ConsoleHelper();
        this.active = true;
    }



    @Override
    public void saveResult() {
        setMemory(getResult());
    }

    @Override
    public String repetitionAction() {
        return  getActionMemory();
    }
    public void selectActions(){
        String action;
        while (isActive()) {
            setFirstNumber(0);
            setSecondNumber(0);
            getConsoleHelper().print();
            action = scanner.next();
            command(action);

        }
    }
    public void command(String action){
        switch (action){
            case "1" : fillNumbers();
                add(firstNumber,secondNumber);
                break;
            case "2" : fillNumbers();
                subtract(firstNumber,secondNumber);
                break;
            case "3" : fillNumbers();
                multiply(firstNumber,secondNumber);
                break;
            case "4" : fillNumbers();
                div(firstNumber, secondNumber);
                break;
            case "5" : saveResult();
                break;
            case "6" : command(repetitionAction());
                break;
            case "0" : setActive(false);
            default:
        }
        setActionMemory(action);
        consoleHelper.printResult(getResult());
    }

public void fillNumbers(){
    String getScan;
    getConsoleHelper().printFirstNumber();
    getScan = scanner.next();
    if (!getScan.equals("m")){
        setFirstNumber(Double.parseDouble(getScan));
    } else{
        setFirstNumber(memory);
    }
    getConsoleHelper().printSecondNumber();
    getScan = scanner.next();
    if (!getScan.equals("m")){
        setSecondNumber(Double.parseDouble(getScan));
    } else{
        setSecondNumber(memory);
    }
}

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ConsoleHelper getConsoleHelper() {
        return consoleHelper;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getActionMemory() {
        return actionMemory;
    }

    public void setActionMemory(String actionMemory) {
        this.actionMemory = actionMemory;
    }

    public static void main(String[] args) {
        InterCalculator interCalculator = new InterCalculator();
        interCalculator.selectActions();
    }
}
