package easy.string;

public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder(s.length());
        char tmp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0)
                str.append((char) (tmp + s.charAt(i) - '0'));
            else {
                tmp = s.charAt(i);
                str.append(tmp);
            }
        }
        return str.toString();
    }
}
