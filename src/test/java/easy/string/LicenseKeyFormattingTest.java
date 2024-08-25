package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LicenseKeyFormattingTest {
    private final LicenseKeyFormatting solution = new LicenseKeyFormatting();

    @Test
    void example1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting(s, k));
    }

    @Test
    void example2() {
        String s = "2-5g-3-J";
        int k = 2;
        assertEquals("2-5G-3J", solution.licenseKeyFormatting(s, k));
    }

    @Test
    void example3() {
        String s = "2-4A0r7-4k";
        int k = 4;
        assertEquals("24A0-R74K", solution.licenseKeyFormatting(s, k));
    }
}