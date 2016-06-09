package yanevskyy.square;

/**
 * Created by MM on 18.05.2016.
 */
public class Factorial {
    public Factorial() {
    }
    public long findFactorial(int f){
        if (f < 1) {
            System.out.println("Enter a positive number");
            return 0;
        }
        int count = 1;
        for (int i = 1; i <= f; i++) {
            count = count * i;
        }
        return count;
    }
}
