package easy.string;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            for (int j = 0, k = word.length() - 1; j < word.length(); j++, k--) {
                if (word.charAt(j) == word.charAt(k)) {
                    if (j > word.length() / 2 - 1)
                        return word;
                } else
                    break;
            }
        }
        return "";
    }
}
