package yanevskyy.figure;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by MM on 17.05.2016.
 */
public class FigureTest {
    @Test
    public void whenGetPointsShouldCalculateMaxDistance(){
        Figure figure = new Figure(new Point(1,3),new Point(2,5),new Point(3,6));
        double max = 0;
        double change = 3.605551275463989;

        max = figure.maxDistance(figure.points);
        Assert.assertThat(max, is(change));
    }
}