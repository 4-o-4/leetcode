package easy.string;

import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] keys = {"type", "color", "name"};
        int k = 0;

        for (; k < keys.length; k++)
            if (keys[k].equals(ruleKey))
                break;
        int finalK = k;
        return (int) items.stream()
                .filter(i -> i.get(finalK).equals(ruleValue))
                .count();
    }
}
