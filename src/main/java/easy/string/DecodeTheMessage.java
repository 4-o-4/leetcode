package easy.string;

import java.util.HashMap;

public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder str = new StringBuilder(message.length());

        for (int i = 0, j = 'a'; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && !map.containsKey(c))
                map.put(c, (char) j++);
        }
        for (int i = 0; i < message.length(); i++)
            str.append(map.getOrDefault(message.charAt(i), ' '));
        return str.toString();
    }
}
