package yanevskyy.square;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 18.05.2016.
 */
public class FactorialTest {
        @Test
        public void whenGetNumberShouldCalculateFactorial(){
            Factorial factorial = new Factorial();
            long count = 0;
            long checken = 2;

            count = factorial.findFactorial(2);

            Assert.assertThat(count, is(checken));
        }

}