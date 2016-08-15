package yanevskyy.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculatorTest {
    InterCalculator interCalculator = new InterCalculator();

    @Before
    public void setUp() throws Exception {
        interCalculator.setFirstNumber(2);
        interCalculator.setSecondNumber(3);
    }

    @Test
    public void selectActions() throws Exception {
        double result;
        double checked = 5;
        /**
         * Testing action add
         */
        interCalculator.runCommand("+");
        result = interCalculator.getResult();

        Assert.assertThat(result, is(checked));

        /**
         * Testing the repetition action.
         */
        checked = 8;

        interCalculator.runCommand("R");
        result = interCalculator.getResult();

        Assert.assertThat(result, is(checked));

        /**
         * Testing action save result.
         */
        checked = 8;

        interCalculator.runCommand("M");
        result = interCalculator.getMemory();

        Assert.assertThat(result, is(checked));

        /**
         * Testing action tg.
         */

        checked = 0.320040389379563;
        interCalculator.setFirstNumber(60);

        interCalculator.runCommand("tg");
        result = interCalculator.getResult();

        Assert.assertThat(result, is(checked));

    }

}