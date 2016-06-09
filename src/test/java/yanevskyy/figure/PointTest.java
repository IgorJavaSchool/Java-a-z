package yanevskyy.figure;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by MM on 17.05.2016.
 */
public class PointTest {
    @Test
    public void whenGetTwoPointsShouldFindDistanceBetweenThem(){
        Point point = new Point(-1,3);
        Point point2 = new Point(3,5);
        double result = 0;
        double change = 4.47213595499958;

        result = point.distanceTo(point2);

        Assert.assertThat(result, is(change));
}
}