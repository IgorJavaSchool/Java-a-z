package yanevskyy.models;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 23.05.2016.
 */
public class ContractorTest {
    @Test
    public void WhenMadeContractorShouldGetHisData(){
        Contractor contractor = new Contractor("Ivan", "Ivanov", 4500, "InStroy");
        String resultName = "";
        String changeName = "Ivanov, Ivan";

        resultName = contractor.getName();

        Assert.assertThat(resultName, is(changeName));

        double resultRate = 0;
        double changeRate = 23.4375;

        resultRate = contractor.getPayRate();

        Assert.assertThat(resultRate, is(changeRate));

        String resultAgancy = "";
        String changeAgancy = "InStroy";

        resultAgancy = contractor.getAgency();

        Assert.assertThat(resultAgancy, is(changeAgancy));


    }

}