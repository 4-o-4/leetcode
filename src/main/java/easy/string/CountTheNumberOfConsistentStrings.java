package easy.string;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;

        for (String s : words) {
            String word = s;
            for (int j = 0; j < allowed.length(); j++) {
                word = word.replace(Character.toString(allowed.charAt(j)), "");
                if (word.isEmpty()) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
