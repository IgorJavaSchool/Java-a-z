package yanevskyy.models;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 23.05.2016.
 */
public class EmployeeTest {
    @Test
    public void WhenMadeEmployeeShouldGetHisData(){
        Employee employee = new Employee("Ivan", "Ivanov", 4500, 24);
        String resultName = "";
        String changeName = "Ivanov, Ivan";

        resultName = employee.getName();

        Assert.assertThat(resultName, is(changeName));

        double resultRate = 0;
        double changeRate = 23.4375;

        resultRate = employee.getPayRate();

        Assert.assertThat(resultRate, is(changeRate));

        int resultVacatoin = 0;
        int changeVacatoin = 24;

        resultVacatoin = employee.getYearlyVacation();

        Assert.assertThat(resultVacatoin, is(changeVacatoin));


    }

}