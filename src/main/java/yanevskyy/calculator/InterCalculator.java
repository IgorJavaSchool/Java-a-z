package yanevskyy.calculator;

import java.util.Scanner;

/**
 * Uses for work with console and has new functions.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculator  implements SuperCalculate {
    /*Calculator*/
    private Calculator calculator;
    /*Engineering calculator*/
    private EngineeringCalculator engineeringCalculator;
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
    public InterCalculator(Calculator calculator, EngineeringCalculator engineeringCalculator) {
        this.scanner = new Scanner(System.in);
        this.printConsole = new PrintConsole();
        this.active = true;
        this.calculator = calculator;
        this.engineeringCalculator = engineeringCalculator;
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
                case "sin" :
                case "cos" :
                case "tg"  :
                case "arctg" : fillOneNumber();
                default: break;
            }
            runCommand(action);
            printConsole.printResult(this.calculator.getResult());
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
            case "+" : this.calculator.add(this.firstNumber,this.secondNumber);
                break;
            case "-" : this.calculator.subtract(this.firstNumber,this.secondNumber);
                break;
            case "*" : this.calculator.multiply(this.firstNumber,this.secondNumber);
                break;
            case "/" : this.calculator.div(this.firstNumber,this.secondNumber);
                break;
            case "sin" : this.engineeringCalculator.sinFind(this.firstNumber);
                break;
            case "cos" : this.engineeringCalculator.cosFind(this.firstNumber);
                break;
            case "tg" : this.engineeringCalculator.tgFind(this.firstNumber);
                break;
            case "arctg" : this.engineeringCalculator.artgFind(this.firstNumber);
                break;
            case "M" : this.memory = this.calculator.getResult();
                break;
            case "R" : this.firstNumber =  this.calculator.getResult();
                runCommand(this.actionMemory);
                break;
            case "0" : setActive(false);
                break;
            default:
        }
        this.actionMemory = action;
    }


    /**
     * Fill the first number and second.
     */
    public void fillNumbers(){
        String stringFromConsole;
        printConsole.printFirstNumber();
        stringFromConsole = scanner.next();
        if (!stringFromConsole.equals("m")){
            this.firstNumber = Double.parseDouble(stringFromConsole);
        } else{
            this.firstNumber =  this.memory;
        }
        printConsole.printSecondNumber();
        stringFromConsole = scanner.next();
        if (!stringFromConsole.equals("m")){
            this.secondNumber = Double.parseDouble(stringFromConsole);
        } else{
            this.secondNumber = this.memory;
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
            this.firstNumber =  Double.parseDouble(getScan);
        } else{
            this.firstNumber =  this.memory;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        InterCalculator interCalculator = new InterCalculator(calculator,engineeringCalculator);
        interCalculator.selectActions();
    }
}
