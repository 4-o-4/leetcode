package easy.string;

import java.util.TreeMap;

public class SortingTheSentence {
    public String sortSentence(String s) {
        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder digit;

        String[] split = s.split(" ");
        for (String word : split) {
            digit = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                char c = word.charAt(j);
                if (Character.isDigit(c))
                    digit.append(c);
                else {
                    if (digit.length() != 1)
                        digit.reverse();
                    map.put(Integer.parseInt(digit.toString()), word.substring(0, j + 1));
                    break;
                }
            }
        }
        return String.join(" ", map.values());
    }
}
