package easy.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        Set<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        int counter = 0;

        for (int i = left; i <= right && i < words.length; i++)
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1)))
                counter++;
        return counter;
    }
}
