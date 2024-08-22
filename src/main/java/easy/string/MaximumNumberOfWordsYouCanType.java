package easy.string;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int counter = 0;

        for (String str : arr) {
            boolean f = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (str.contains(brokenLetters.charAt(i) + "")) {
                    f = false;
                    break;
                }
            }
            if (f)
                counter++;
        }
        return counter;
    }
}
