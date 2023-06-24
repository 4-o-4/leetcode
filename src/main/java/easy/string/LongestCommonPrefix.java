package easy.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 || strs[0].isEmpty())
            return strs[0];
        String str = null;
        char c = 0;
        int i = 0;
        int k = 0;
        int size = 0;

        for (String s : strs) {
            if (str == null) {
                str = s;
                c = str.charAt(0);
                size = str.length();
            } else {
                if (s.isEmpty())
                    return "";
                if (k > 1 && s.length() == 1)
                    return "";
                for (i = 0; i < s.length() && size != 0; i++, size--) {
                    if (c == s.charAt(0) && str.charAt(i) == s.charAt(i)) {
                        k = i;
                        k++;
                    } else {
                        c = s.charAt(i);
                        break;
                    }
                }
                size = k;
            }
        }
        return k == 0 || i == k - 1 ? "" : str.substring(0, k);
    }
}
