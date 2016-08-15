package yanevskyy.calculator;

import java.util.Scanner;

/**
 * Uses for work with console and has new functions.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculator extends Calculator implements SuperCalculate {
    /*First number for actions*/
    private double firstNumber;
    /*Second number for actions*/
    private double secondNumber;
    /*Stores result*/
    private double memory;
    /*The last command*/
    private String actionMemory;
    /*Read message from console*/
    private Scanner scanner;
    /*The parameter has different lists menu*/
    private PrintConsole printConsole;
    /*Active program*/
    private boolean active;

    /**
     * Default constructor
     */
    public InterCalculator() {
        this.scanner = new Scanner(System.in);
        this.printConsole = new PrintConsole();
        this.active = true;
    }

    /**
     * Read from console user's message and fill first and second numbers.
     */
    @Override
    public void selectActions(){
        String action;
        while (isActive()) {
            printConsole.print();
            action = scanner.next();
            switch (action){
                case "+" :
                case "-" :
                case "*" :
                case "/" : fillNumbers();
                    break;
                case "sin"   :
                case "cos"   :
                case "tg"   :
                case "arctg" : fillOneNumber();
                default: break;
            }
            runCommand(action);
            printConsole.printResult(getResult());
            printConsole.writer("");
        }
    }

    /**
     * Select and run the calculator's command.
     * @param action The user's command.
     */
    @Override
    public void runCommand(String action){
        switch (action){
            case "+" : add(getFirstNumber(),getSecondNumber());
                break;
            case "-" : subtract(getFirstNumber(),getSecondNumber());
                break;
            case "*" : multiply(getFirstNumber(),getSecondNumber());
                break;
            case "/" : div(getFirstNumber(),getSecondNumber());
                break;
            case "sin" : sinFind(getFirstNumber());
                break;
            case "cos" : cosFind(getFirstNumber());
                break;
            case "tg" : tgFind(getFirstNumber());
                break;
            case "arctg" : artgFind(getFirstNumber());
                break;
            case "M" : setMemory(getResult());
                break;
            case "R" : setFirstNumber(getResult());
                runCommand(getActionMemory());
                break;
            case "0" : setActive(false);
                break;
            default:
        }
        setActionMemory(action);
    }


    /**
     * Fill the first number and second.
     */
    public void fillNumbers(){
        String stringFromConsole;
        printConsole.printFirstNumber();
        stringFromConsole = scanner.next();
        if (!stringFromConsole.equals("m")){
            setFirstNumber(Double.parseDouble(stringFromConsole));
        } else{
            setFirstNumber(getMemory());
        }
        printConsole.printSecondNumber();
        stringFromConsole = scanner.next();
        if (!stringFromConsole.equals("m")){
            setSecondNumber(Double.parseDouble(stringFromConsole));
        } else{
            setSecondNumber(getMemory());
        }
    }

    /**
     * Set decimal for sin, cos, tg, arctg.
     * @return
     */
    public void fillOneNumber(){
        String getScan;
        printConsole.printOneNumber();
        getScan = scanner.next();
        if (!getScan.equals("m")){
            setFirstNumber(Double.parseDouble(getScan));
        } else{
            setFirstNumber(getMemory());
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
    /**
     * Find sinus.
     */
    public void sinFind(double first){
        setResult(Math.sin(first));
    }

    /**
     * Find cosine.
     */
    public void cosFind(double first){
        setResult(Math.cos(first));
    }

    /**
     * Find tangent.
     */
    public void tgFind(double first){
        setResult(Math.tan(first));
    }

    /**
     * Find arctangent.
     */
    public void artgFind(double first){
        setResult(Math.atan(first));
    }
}
