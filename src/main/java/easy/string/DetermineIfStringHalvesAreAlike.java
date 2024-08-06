package easy.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> chars = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        int middle = s.length() / 2 - 1;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i <= middle)
                counter += isChar(chars, s.charAt(i));
            else {
                counter -= isChar(chars, s.charAt(i));
                if (counter == -1)
                    return false;
            }
        }
        return counter == 0;
    }

    private int isChar(Set<Character> chars, char c) {
        return chars.contains(Character.toLowerCase(c)) ? 1 : 0;
    }
}
