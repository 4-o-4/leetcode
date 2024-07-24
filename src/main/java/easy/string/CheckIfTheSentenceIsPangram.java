package easy.string;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26)
            return false;
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++)
            alphabet[sentence.charAt(i) - 'a'] = true;
        for (boolean c : alphabet)
            if (!c)
                return false;
        return true;
    }
}
