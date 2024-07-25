package easy.string;

public class CountAsterisks {
    public int countAsterisks(String s) {
        int count = 0;

        String[] split = s.split("\\|");
        for (int i = 0; i < split.length; i += 2) {
            String word = split[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '*')
                    count++;
            }
        }
        return count;
    }
}
