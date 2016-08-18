package yanevskyy.calculator;

/**
 * Uses for help user select the action and printMenu in console the message.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class PrintConsole {

    /**
     * Print in console main menu.
     */
    public void printMenu(){
        writer("Веберите одну из операций");
        writer(String.format("%-5s%-5s", "+", " - Складывать числа"));
        writer(String.format("%-5s%-5s", "-", " - Отнимать числа"));
        writer(String.format("%-5s%-5s", "*", " - Умножать числа"));
        writer(String.format("%-5s%-5s", "/", " - Делить числа"));
        writer(String.format("%-5s%-5s", "sin", " - синус числа"));
        writer(String.format("%-5s%-5s", "cos", " - косинус числа"));
        writer(String.format("%-5s%-5s", "tg", " - тангенс числа"));
        writer(String.format("%-5s%-5s", "arctg", " - арктангенс числа"));
    }

    /**
     * Prints received message.
     * @param message Received message.
     */
    public void writer(String message){
        System.out.println(message);
    }

}
