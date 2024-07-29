package easy.string;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for (String pattern : patterns)
            if (word.contains(pattern))
                counter++;
        return counter;
    }
}
