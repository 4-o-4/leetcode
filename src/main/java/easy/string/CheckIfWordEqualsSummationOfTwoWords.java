package easy.string;

public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first;
        int second;
        int target;

        first = sum(firstWord);
        second = sum(secondWord);
        target = sum(targetWord);
        return first + second == target;
    }

    private int sum(String str) {
        StringBuilder sum = new StringBuilder();

        for (int i = 0, f = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == f && c == 'a')
                f++;
            else
                sum.append(c - 'a');
        }
        if (sum.isEmpty())
            return 0;
        return Integer.parseInt(sum.toString());
    }
}
