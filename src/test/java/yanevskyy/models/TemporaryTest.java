package yanevskyy.models;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 23.05.2016.
 */
public class TemporaryTest {
    @Test
    public void WhenMadeTemporaryShouldGetHisData(){
        Temporary temporary = new Temporary("Ivan", "Ivanov", 4500, "Progress");
        String resultName = "";
        String changeName = "Ivanov, Ivan";

        resultName = temporary.getName();

        Assert.assertThat(resultName, is(changeName));

        double resultRate = 0;
        double changeRate = 23.4375;

        resultRate = temporary.getPayRate();

        Assert.assertThat(resultRate, is(changeRate));

        String resultAgancy = "";
        String changeAgancy = "Progress";

        resultAgancy = temporary.getAgency();

        Assert.assertThat(resultAgancy, is(changeAgancy));


    }

}