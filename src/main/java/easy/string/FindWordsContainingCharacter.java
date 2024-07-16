package easy.string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            if (words[i].indexOf(x) != -1)
                arr.add(i);
        return arr;
    }
}
