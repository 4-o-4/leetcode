package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DestinationCityTest {
    private final DestinationCity solution = new DestinationCity();

    @Test
    void example1() {
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        assertEquals("Sao Paulo", solution.destCity(paths));
    }

    @Test
    void example2() {
        List<List<String>> paths = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A")
        );
        assertEquals("A", solution.destCity(paths));
    }

    @Test
    void example3() {
        List<List<String>> paths = List.of(
                List.of("A", "Z")
        );
        assertEquals("Z", solution.destCity(paths));
    }

    @Test
    void example4() {
        List<List<String>> paths = List.of(
                List.of("qMTSlfgZlC", "ePvzZaqLXj"),
                List.of("xKhZXfuBeC", "TtnllZpKKg"),
                List.of("ePvzZaqLXj", "sxrvXFcqgG"),
                List.of("sxrvXFcqgG", "xKhZXfuBeC"),
                List.of("TtnllZpKKg", "OAxMijOZgW")
        );
        assertEquals("OAxMijOZgW", solution.destCity(paths));
    }

    @Test
    void example5() {
        List<List<String>> paths = List.of(
                List.of("ZyRLxE xmA", "WQztariTJd"),
                List.of("pSoBauoJox", "ZyRLxE xmA"),
                List.of("lbEWEqcBKg", "tKsFZosRmT"),
                List.of("QfKdgCRgGv", "lbEWEqcBKg"),
                List.of("WQztariTJd", "QfKdgCRgGv"),
                List.of("tKsFZosRmT", "NhNPVREEsh")
        );
        assertEquals("NhNPVREEsh", solution.destCity(paths));
    }
}