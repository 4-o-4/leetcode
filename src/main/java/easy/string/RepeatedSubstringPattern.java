package easy.string;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1)
            return false;
        char[] sArray = s.toCharArray();
        int length = s.length();
        int k = 0, j = 0;
        for (int i = 1; i < length; i++) {
            if (k == j)
                j = 0;
            if (sArray[j] == sArray[i]) {
                if (k == 0)
                    k = i - j;
                j++;
            } else {
                if (k != 0) {
                    i = k + 1;
                    k = 0;
                }
            }
        }
        return k == j;
    }
}
