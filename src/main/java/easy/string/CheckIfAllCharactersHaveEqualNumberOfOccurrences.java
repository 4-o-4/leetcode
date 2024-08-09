package easy.string;

import java.util.HashSet;
import java.util.Set;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) set.add(aChar);
        if (s.length() % set.size() != 0)
            return false;
        int j = 0;
        for (Character c : set) {
            int tmp = s.length();
            s = s.replace(c.toString(), "");
            if (j == 0)
                j = tmp - s.length();
            else if (j != tmp - s.length())
                break;
        }
        return s.isEmpty() || s.length() == j;
    }
}
