package yanevskyy.square;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 18.05.2016.
 */
public class SquareTest {
    @Test
    public void whenGetNumberShouldCalculateFactorial(){
        Square square = new Square(1,2,5);
        String[] args = {"1","2","3","4","5","6","7","8","9","10",};
        float result = 0;
        float change = 125.0F;

        for (int i = 0; i < args.length; i++) {
            result = square.calculate(Integer.parseInt(args[i]));
            System.out.println(result);
        }

        Assert.assertThat(change, is(result));

    }

}