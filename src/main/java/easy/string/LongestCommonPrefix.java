package easy.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 || strs[0].isEmpty())
            return strs[0];
        String str = strs[0];
        char c = strs[0].charAt(0);
        int k = str.length();

        for (int i = 0; i < k; i++) {
            for (int j = 1; j < strs.length; j++) {
                String str1 = strs[j];
                if (str1.isEmpty())
                    return "";
                if (!str.startsWith(strs[j].substring(0, i))) {
                    k = i - 1;
                    break;
                } else {
                    if (k == j && str1.length() != 1 || c != str1.charAt(0))
                        return "";
                    else if (i == str1.length()) {
                        k = i;
                        break;
                    }
                }
            }
        }
        return str.substring(0, k);
    }
}
