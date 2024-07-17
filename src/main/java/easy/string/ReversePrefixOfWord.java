package easy.string;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1)
            return word;
        else {
            StringBuilder str = new StringBuilder(word.length());
            for (int i = index; i >= 0; i--)
                str.append(word.charAt(i));
            for (int i = index + 1; i < word.length(); i++)
                str.append(word.charAt(i));
            return str.toString();
        }
    }
}
