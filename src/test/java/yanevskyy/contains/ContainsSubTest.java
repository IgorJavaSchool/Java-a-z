package yanevskyy.contains;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 23.05.2016.
 */
public class ContainsSubTest {
    @Test
    public void WhenPassSubstringShouldContainsSubStringInStringOrNot(){
        ContainsSub containsSub = new ContainsSub();
        String str[] = {
                "Продолжение",
                "Продолжение",
                "ПроолжениеПрод",
                "ПроолжениеПро",
                "Проолжение",
                "Прод",
                "Про",
                "Про"};
        String subStr[] = {
                "Прод",
                "прод",
                "Прод",
                "Прод",
                "Прод",
                "Прод",
                "Прод",
                "",};
        boolean result = false;
        boolean change[] = {
                true,
                false,
                true,
                false,
                false,
                true,
                false,
                false};

        for (int i = 0 ; i < str.length; i++) {

            result = containsSub.contains(str[i], subStr[i]);

            Assert.assertThat(result, is(change[i]));
        }


    }

}