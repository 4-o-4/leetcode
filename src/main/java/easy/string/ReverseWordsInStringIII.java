package easy.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        return Stream.of(s.split(" "))
                .map(this::reverse)
                .collect(Collectors.joining(" "));

    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
