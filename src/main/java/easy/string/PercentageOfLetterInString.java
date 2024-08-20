package easy.string;

public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int counter = 0;

        for (char c : s.toCharArray())
            if (c == letter)
                counter++;
        return counter == 0 ? 0 : counter * 100 / s.length();
    }
}
