package easy.string;

public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int[] arrs = new int[26];
        int res = 0;

        for (int i = 0; i < s.length(); i++)
            arrs[sChars[i] - 'a'] = i;
        for (int i = 0; i < t.length(); i++) {
            int j = arrs[tChars[i] - 'a'];
            arrs[tChars[i] - 'a'] = Math.abs(j - i);
        }
        for (int i = 0; i < arrs.length; i++)
            res += arrs[i];
        return res;
    }
}
