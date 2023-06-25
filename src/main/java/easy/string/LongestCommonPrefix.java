package easy.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 || strs[0].isEmpty())
            return strs[0];
        String str = strs[0];
        int k = str.length();

        for (int i = 0; i <= k; i++) {
            for (int j = 1; j < strs.length; j++) {
                String str1 = strs[j];
                if (str1.isEmpty())
                    return "";
                if (i > str1.length() || !str.startsWith(strs[j].substring(0, i))) {
                    k = i - 1;
                    break;
                }
            }
        }
        return str.substring(0, k);
    }
}
