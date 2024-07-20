package easy.string;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            int j = indices[i];
            arr[j] = s.charAt(i);
        }
        return new String(arr);
    }
}
