package easy.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        return Stream.of(s.split(" ")).limit(k)
                .collect(Collectors.joining(" "));
    }
}
