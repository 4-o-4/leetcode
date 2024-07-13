package easy.string;

public class ScoreOfString {
    public int scoreOfString(String s) {
        int sumASCII = 0;
        char c = '\0';
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (i != 0)
                sumASCII += Math.abs(c - arr[i]);
            c = arr[i];
        }
        return sumASCII;
    }
}
