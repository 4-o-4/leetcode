package easy.string;

public class SplitStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int numberOfSubstrings = 0;
        int charL = 0;
        int charR = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                charL++;
            else
                charR++;
            if (charL == charR) {
                numberOfSubstrings++;
                charL = 0;
                charR = 0;
            }
        }
        return numberOfSubstrings;
    }
}
