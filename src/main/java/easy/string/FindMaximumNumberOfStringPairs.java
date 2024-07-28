package easy.string;

public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                for (int k = 0, l = 1; k < 2; k++, l--) {
                    if (words[i].charAt(k) != words[j].charAt(l))
                        break;
                    if (k == 1)
                        max++;
                }
            }
        }
        return max;
    }
}
