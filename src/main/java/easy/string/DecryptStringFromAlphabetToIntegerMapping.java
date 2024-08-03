package easy.string;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        char[] num = new char[2];

        for (int i = s.length() - 1, j = 0; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#')
                j = 2;
            else if (j != 0) {
                num[--j] = c;
                if (j == 0)
                    str.append((char) ('`' + Integer.parseInt(String.valueOf(num))));
            } else
                str.append((char) ('0' + c));
        }

        return str.reverse().toString();
    }
}
