package yanevskyy.calculator;

/**
 * Uses for help user select the action and print in console the message.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class PrintConsole {

    /**
     * Print in console main menu.
     */
    public void print(){
        writer("Веберите одну из операций");
        writer(String.format("%-5s%-5s", "+", " - Складывать числа"));
        writer(String.format("%-5s%-5s", "-", " - Отнимать числа"));
        writer(String.format("%-5s%-5s", "*", " - Умножать числа"));
        writer(String.format("%-5s%-5s", "/", " - Делить числа"));
        writer(String.format("%-5s%-5s", "sin", " - синус числа"));
        writer(String.format("%-5s%-5s", "cos", " - косинус числа"));
        writer(String.format("%-5s%-5s", "tg", " - тангенс числа"));
        writer(String.format("%-5s%-5s", "arctg", " - арктангенс числа"));
        writer(String.format("%-5s%-5s", "M", " - Запомнить результат"));
        writer(String.format("%-5s%-5s", "R", " - Повторить операцию"));
        writer(String.format("%-5s%-5s", "0", " - Закончить"));
    }

    /**
     * Prints message for set first digital or digital from memory.
     */
    public void printFirstNumber(){
        writer("Введите первое число или используйте число из памяти(\"m\")");
    }

    /**
     * Prints message for set second digital or digital from memory.
     */
    public void printSecondNumber(){
        writer("Введите второе число или используйте число из памяти(\"m\")");
    }

    /**
     * Prints message for sin, cos, tg, arctg.
     */
    public void printOneNumber(){
        writer("Введите число для расчёта или используйте число из памяти(\"m\")");
    }

    /**
     * Prints received message.
     * @param message Received message.
     */
    public void writer(String message){
        System.out.println(message);
    }

    /**
     * Print the action's result.
     * @param result Action's result.
     */
    public void printResult(double result){
        writer("Result = " + result);
    }
}
