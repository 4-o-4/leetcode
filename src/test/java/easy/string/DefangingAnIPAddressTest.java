package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefangingAnIPAddressTest {
    private final DefangingAnIPAddress solution = new DefangingAnIPAddress();

    @Test
    void example1() {
        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr(address));
    }

    @Test
    void example2() {
        String address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr(address));
    }
}