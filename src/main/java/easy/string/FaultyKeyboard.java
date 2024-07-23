package easy.string;

public class FaultyKeyboard {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                int j = i + 1;
                if (j < s.length() && s.charAt(j) == 'i')
                    i = j;
                else
                    str.reverse();
            } else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}
