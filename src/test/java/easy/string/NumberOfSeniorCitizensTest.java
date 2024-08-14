package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfSeniorCitizensTest {
    private final NumberOfSeniorCitizens test = new NumberOfSeniorCitizens();

    @Test
    void example1() {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        assertEquals(2, test.countSeniors(details));
    }

    @Test
    void example2() {
        String[] details = {"1313579440F2036", "2921522980M5644"};
        assertEquals(0, test.countSeniors(details));
    }
}