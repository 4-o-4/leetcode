package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotReturnToOriginTest {
    private final RobotReturnToOrigin test = new RobotReturnToOrigin();

    @Test
    void example1() {
        String moves = "UD";
        assertTrue(test.judgeCircle(moves));
    }

    @Test
    void example2() {
        String moves = "LL";
        assertFalse(test.judgeCircle(moves));
    }
}