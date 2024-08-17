package easy.string;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            int b = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == separator) {
                    String str = word.substring(b, i);
                    if (!str.isEmpty())
                        list.add(str);
                    b = i + 1;
                } else if (i == word.length() - 1) {
                    String str = word.substring(b);
                    list.add(str);
                }
            }
        }
        return list;
    }
}
