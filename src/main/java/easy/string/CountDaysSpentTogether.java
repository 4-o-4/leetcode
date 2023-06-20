package easy.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDaysSpentTogether {
    public static Pattern pattern = Pattern.compile("(\\d+)");
    public static int[] mm = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1 = intMm(arriveAlice);
        int a2 = intMm(leaveAlice);
        int b1 = intMm(arriveBob);
        int b2 = intMm(leaveBob);

        if (a1 == b2 || a2 == b1)
            return 1;
        if (a1 > b2 || a2 < b1)
            return 0;
        int max = Math.max(a1, b1);
        int min = Math.min(a2, b2);
        return min - max + 1;
    }

    private int intMm(String str) {
        int length = 0;
        Matcher matcher = pattern.matcher(str);
        for (int i = 0; i <= matcher.groupCount() && matcher.find(); i++) {
            if (i == 0) {
                int im = Integer.parseInt(matcher.group(i)) - 1;
                for (int j = 0; j < mm.length && j != im; j++) {
                    length += mm[j];
                }
            } else {
                length += Integer.parseInt(matcher.group(i));
            }
        }
        return length;
    }
}
