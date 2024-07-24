package easy.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    private final String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        StringBuilder str;

        for (String s : words) {
            str = new StringBuilder();
            for (int j = 0; j < s.length(); j++)
                str.append(codes[s.charAt(j) - 'a']);
            set.add(str.toString());
        }
        return set.size();
    }
}
