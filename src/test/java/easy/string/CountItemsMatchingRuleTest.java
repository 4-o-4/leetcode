package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountItemsMatchingRuleTest {
    private final CountItemsMatchingRule solution = new CountItemsMatchingRule();

    @Test
    void example1() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        assertEquals(1, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    void example2() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        assertEquals(2, solution.countMatches(items, ruleKey, ruleValue));
    }
}