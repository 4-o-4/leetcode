package easy.string;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder(word1.length() + word2.length());

        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++) {
            if (i < word1.length())
                str.append(word1.charAt(i));
            if (j < word2.length())
                str.append(word2.charAt(j));
        }
        return str.toString();
    }
}
