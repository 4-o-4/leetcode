package easy.string;

public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder(num);

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0')
                str.deleteCharAt(i);
            else
                break;
        }
        return str.toString();
    }
}
