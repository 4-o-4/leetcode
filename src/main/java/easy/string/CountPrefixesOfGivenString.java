package easy.string;

public class CountPrefixesOfGivenString {
    public int countPrefixes(String[] words, String s) {
        int counter = 0;

        for (String word : words)
            if (s.startsWith(word))
                counter++;
        return counter;
    }
}
