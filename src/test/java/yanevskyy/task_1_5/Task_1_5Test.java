package yanevskyy.task_1_5;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by MM on 18.05.2016.
 */
public class Task_1_5Test {
    @Test
    public void whenGetArrayShouldSortedIt(){
        Task_1_5 task_1_5 = new Task_1_5();
        int[] result = new int[10];
        int[] change = {0,1,2,3,4,5,6,7,8,9};

        result = task_1_5.sortValues(new int[] {2,3,5,0,1,4,6,7,8,9});

        Assert.assertThat(result, is(change));
    }

    @Test
    public void whenGetVarArraysShouldRotateBy90Degrees(){
        Task_1_5 task_1_5 = new Task_1_5();
        int[][] result = new int[3][3];
        int[][] change = {
                {0, 0, 0},
                {1, 0, 0},
                {0, 0, 0}
        };

        result = task_1_5.rotateValues(new int[][]{
                {0,0,0},
                {0,0,0},
                {0,1,0},
        });

        Assert.assertThat(result, is(change));
    }

    @Test
    public void whenGetStringArrayShouldRemoveDuplicates() {
        Task_1_5 task_1_5 = new Task_1_5();
        String[] result = new String[0];
        String[] test = "The Java Tutorials are practical guides for programmers practical who want to use the Java programming language to create applications. The".split(" ");
        String[] change = "The Java Tutorials are practical guides for programmers who want to use the programming language create applications.".split(" ");

        result = task_1_5.removeDuplicate(test);

        Assert.assertThat(result, is(change));

        String[] result2 = new String[0];
        String[] test2 = {"Java", "Java"};
        String[] change2 = {"Java"};

        result2 = task_1_5.removeDuplicate(test2);

        Assert.assertThat(result2, is(change2));
    }

}