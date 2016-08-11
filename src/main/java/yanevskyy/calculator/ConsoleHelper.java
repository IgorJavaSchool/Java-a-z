package yanevskyy.calculator;

/**
 * Uses for help user select the action and print in console the message.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class ConsoleHelper {

    /**
     * Print in console main menu.
     */
    public void print(){
        writer("Веберите одну из операций");
        writer("1 - Складывать числа");
        writer("2 - Отнимать числа ");
        writer("3 - Умножать числа");
        writer("4 - Делить числа");
        writer("5 - Запомнить результат");
        writer("6 - Повторить операцию");
        writer("0 - Закончить");
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
