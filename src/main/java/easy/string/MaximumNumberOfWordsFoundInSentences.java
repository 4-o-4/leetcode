package easy.string;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String str : sentences) {
            int i = str.split(" ").length;
            if (i > max)
                max = i;
        }
        return max;
    }
}
