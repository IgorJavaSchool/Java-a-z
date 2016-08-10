package yanevskyy.task_1_5;

/**
 * Created by MM on 18.05.2016.
 */
public class Task_1_5 {

    public Task_1_5() {
    }

    /**
     * Sorts an array of bubble
     * @param values array with number.
     * @return
     */
    public int[] sortValues(int[] values){
        int count;
        boolean point;
        for (int i = 0; i < values.length; i++) {
            point = false;
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    count = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = count;
                    point = true;
                }
            }
            if (!point)
                break;
        }
        return values;
    }

    /**
     * Rotates var array by 90 degrees
     * @param values Array with symbol.
     * @return
     */
    public int[][] rotateValues(int[][] values){
        int[][]result = new int[values.length][values.length];
        int count;
        for (int i = 0; i < values.length; i++) {
            count = values.length - 1;
            for (int j = 0; j < values.length ; j++) {
                result[i][j] = values[count][i];
                count--;
            }
        }
        return result;
    }

    /**
     * Remove duplicate in the array
     * @param strings Array with worlds.
     * @return
     */
    public String[] removeDuplicate(String[] strings){
        String line;
        String[] array;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(""))
                continue;
            line = strings[i];
            stringBuilder.append(strings[i] + " ");
            for (int j = 0; j < strings.length; j++) {
                if (i != j){
                    if (line.equals(strings[j])) {
                        strings[j] = "";
                    }
                }
            }
        }

        array = stringBuilder.toString().split(" ");

        return array;
    }

}
