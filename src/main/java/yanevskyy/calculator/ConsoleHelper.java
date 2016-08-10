package yanevskyy.calculator;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class ConsoleHelper {
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
    public void printFirstNumber(){
        writer("Введите первое число или используйте число из памяти(\"m\")");
    }
    public void printSecondNumber(){
        writer("Введите второе число или используйте число из памяти(\"m\")");
    }
    public void writer(String message){
        System.out.println(message);
    }
    public void printResult(double result){
        writer("Result = " + result);
    }
}
