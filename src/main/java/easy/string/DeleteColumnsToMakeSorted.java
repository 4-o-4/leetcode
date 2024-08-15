package easy.string;

import java.util.Arrays;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        StringBuilder[] arr = new StringBuilder[strs[0].length()];
        int counter = 0;

        for (int i = 0; i < strs[0].length(); i++)
            arr[i] = new StringBuilder();
        for (String s : strs)
            for (int j = 0; j < s.length(); j++)
                arr[j].append(s.charAt(j));
        for (StringBuilder stringBuilder : arr) {
            String str = stringBuilder.toString();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            if (!str.equals(new String(chars)))
                counter++;
        }
        return counter;
    }
}
