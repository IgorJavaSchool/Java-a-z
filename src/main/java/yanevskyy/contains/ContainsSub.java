package yanevskyy.contains;

/**
 * Created by MM on 23.05.2016.
 */
public class ContainsSub {

    public ContainsSub() {
    }

    /**
     * Finds transmitted substring in a string.
     * @param str
     * @param sub
     * @return
     */
    boolean contains(String str, String sub) {
        if ((str == "") || (sub == ""))
            return false;
        char[] charsStr = str.toCharArray();
        char[] charsSub = sub.toCharArray();
        if (charsSub.length > charsStr.length)
            return false;
        int count;
        int lenghtSub = charsSub.length - 1;
        boolean contain = false;
        for (int i = 0; i < charsStr.length - lenghtSub; i++) {
            if (charsStr[i] == charsSub[0]) {
                count = i;
                contain = true;
                for (int j = 1; j < charsSub.length; j++) {
                    count++;
                    if (charsStr[count] != charsSub[j]) {
                        contain = false;
                        break;
                    }
                }
            }
            if (contain)
                break;
        }
        return contain;
    }
}
