package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LicenseKeyFormattingTest {
    private LicenseKeyFormatting licenseKeyFormatting;

    @BeforeEach
    void init() {
        this.licenseKeyFormatting = new LicenseKeyFormatting();
    }

    @Test
    void licenseKeyFormatting1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting(s, k));
    }

    @Test
    void licenseKeyFormatting2() {
        String s = "2-5g-3-J";
        int k = 2;
        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting(s, k));
    }

    @Test
    void licenseKeyFormatting3() {
        String s = "2-4A0r7-4k";
        int k = 4;
        assertEquals("24A0-R74K", licenseKeyFormatting.licenseKeyFormatting(s, k));
    }
}