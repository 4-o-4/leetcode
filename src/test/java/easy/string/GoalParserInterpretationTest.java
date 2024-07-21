package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoalParserInterpretationTest {
    private final GoalParserInterpretation test = new GoalParserInterpretation();

    @Test
    void example1() {
        String command = "G()(al)";
        assertEquals("Goal", test.interpret(command));
    }

    @Test
    void example2() {
        String command = "G()()()()(al)";
        assertEquals("Gooooal", test.interpret(command));
    }

    @Test
    void example3() {
        String command = "(al)G(al)()()G";
        assertEquals("alGalooG", test.interpret(command));
    }
}