package easy.string;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        byte[] sBytes = s.getBytes();
        byte[] tBytes = t.getBytes();
        int size = s.length();
        int jj = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = jj; j < t.length(); j++) {
                if (sBytes[i] == tBytes[j]) {
                    size--;
                    jj = j + 1;
                    break;
                }
            }
        }
        return size == 0;
    }
}
