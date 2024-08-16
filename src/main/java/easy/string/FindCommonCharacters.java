package easy.string;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[][] a = new int[words.length][26];

        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words[i].length(); j++)
                a[i][words[i].charAt(j) - 'a']++;
        for (int i = 0; i < a[0].length; i++) {
            int counter = 0;
            for (int[] ints : a) {
                int jj = ints[i];
                if (jj == 0) {
                    counter = 0;
                    break;
                } else if (counter == 0)
                    counter = jj;
                else
                    counter = Math.min(counter, jj);
            }
            if (counter != 0)
                for (int j = 0; j < counter; j++)
                    list.add(Character.toString(i + 'a'));
        }
        return list;
    }
}
