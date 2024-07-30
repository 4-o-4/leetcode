package easy.string;

public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        int counter = 0;
        char[] chars = s.toCharArray();
        char tmp = 0;

        for (int i = 0; i < chars.length; i++) {
            if (tmp == 0)
                tmp = charToLowerCase(chars[i]);
            else if (tmp != charToLowerCase(chars[i])) {
                tmp = charToLowerCase(chars[i]);
                counter++;
            }
        }
        return counter;
    }

    private char charToLowerCase(char c) {
        if (c >= 'A' && 'Z' >= c)
            return (char) (c + ' ');
        return c;
    }
}
