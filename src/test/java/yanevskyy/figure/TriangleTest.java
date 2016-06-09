package yanevskyy.figure;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by MM on 17.05.2016.
 */
public class TriangleTest {
    @Test
    public void whenGetTriangleShouldCalculateArea(){
        Triangle triangle = new Triangle(new Point(-1,3), new Point(2,6), new Point(5,10));
        double area = 0;
        double change = 1.4999999999999662;

        area = triangle.area();

        Assert.assertThat(area, is(change));

    }

    @Test
    public void whenGetTriangleShouldCalculateSemiperimetr(){
        Triangle triangle = new Triangle(new Point(-1,3), new Point(2,5), new Point(3,10));
        double semiP = 0;
        double change = 8.383414268677662;

        semiP = triangle.semiperimeter();

        Assert.assertThat(semiP, is(change));

    }

    @Test
    public void whenGetTriangleShouldCheckValidity(){
        Triangle triangle = new Triangle(new Point(-1,3), new Point(-1,5), new Point(-1,10));
        boolean valid = false;
        boolean change = false;

        valid = triangle.isTriangleValid();

        Assert.assertThat(valid, is(change));
    }
}