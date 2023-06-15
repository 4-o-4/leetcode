package easy.string;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (str.append(toUpperChar(s.charAt(i))).charAt(i) == '-') {
                i++;
                for (int j = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
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
            }
        }
        return str.toString();
    }

    private static char toUpperChar(char c) {
        return Character.toUpperCase(c);
    }
}
