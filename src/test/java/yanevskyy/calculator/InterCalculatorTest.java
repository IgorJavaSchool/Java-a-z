package yanevskyy.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class InterCalculatorTest {
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void selectActions() throws Exception {
        InterCalculator interCalculator = new InterCalculator();
        String[] text = new String[]{"1", "2", "3",};

        systemInMock.provideLines(text);

        interCalculator.main(text);
        double result = interCalculator.getResult();

        assertEquals(5, result);

    }

}