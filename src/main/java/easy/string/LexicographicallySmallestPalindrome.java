package easy.string;

public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                if (chars[i] > chars[j])
                    chars[i] = chars[j];
                else
                    chars[j] = chars[i];
            }
        }
        return new String(chars);
    }
}
