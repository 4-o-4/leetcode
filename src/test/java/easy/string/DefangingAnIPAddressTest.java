package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIPAddressTest {
    private DefangingAnIPAddress defangingAnIPAddress;

    @BeforeEach
    void init() {
        this.defangingAnIPAddress = new DefangingAnIPAddress();
    }

    @Test
    void defangIPaddrExample1() {
        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1", defangingAnIPAddress.defangIPaddr(address));
    }

    @Test
    void defangIPaddrExample2() {
        String address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0", defangingAnIPAddress.defangIPaddr(address));
    }
}