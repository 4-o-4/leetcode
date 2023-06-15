package easy.string;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length(), j = 0; i != 0; i--) {
            char c = s.charAt(i - 1);
            if (c != '-') {
                if (j == k) {
                    j = 0;
                    str.append('-');
                    str.append(toUpperChar(c));
                } else {
                    str.append(toUpperChar(c));
                }
                j++;
            }
        }
        return str.reverse().toString();
    }

    private static char toUpperChar(char c) {
        return Character.toUpperCase(c);
    }
}
