package yanevskyy.square;

import yanevskyy.calculator.Calculator;

/**
 * Created by MM on 18.05.2016.
 */
public class Square {
    int a;
    int b;
    int c;

    public Square(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float calculate(int x){
        return (float) (a*Math.pow(x,2) + b * x + c);
    }

    public static void main(String[] args) {
        Square square = new Square(3,4,6);
        int count;
        float result;
        for (int i = 0; i < args.length; i++) {
            count = Integer.parseInt(args[i]);
            result = square.calculate(count);
            System.out.println(result);
        }
    }
}
