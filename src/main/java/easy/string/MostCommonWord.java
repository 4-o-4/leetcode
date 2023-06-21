package easy.string;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            String key = matcher.group().toLowerCase();
            if (map.containsKey(key)) {
                map.computeIfPresent(key, (k, v) -> v += 1);
            } else {
                map.put(key, 1);
            }
        }
        for (String s : banned)
            map.remove(s);

        int max = 0;
        String key = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}
