package easy.string;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        char[] arr = new char[26];
        char c = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            arr[c - 'a']++;
            if (arr[c - 'a'] > 1)
                break;
        }
        return c;
    }
}
