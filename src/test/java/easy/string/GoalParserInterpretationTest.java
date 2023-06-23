package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalParserInterpretationTest {
    private GoalParserInterpretation goalParserInterpretation;

    @BeforeEach
    void init() {
        this.goalParserInterpretation = new GoalParserInterpretation();
    }

    @Test
    void interpretExample1() {
        String command = "G()(al)";
        assertEquals("Goal", goalParserInterpretation.interpret(command));
    }

    @Test
    void interpretExample2() {
        String command = "G()()()()(al)";
        assertEquals("Gooooal", goalParserInterpretation.interpret(command));
    }

    @Test
    void interpretExample3() {
        String command = "(al)G(al)()()G";
        assertEquals("alGalooG", goalParserInterpretation.interpret(command));
    }
}