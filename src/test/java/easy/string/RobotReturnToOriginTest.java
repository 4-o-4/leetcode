package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotReturnToOriginTest {
    private final RobotReturnToOrigin solution = new RobotReturnToOrigin();

    @Test
    void example1() {
        String moves = "UD";
        assertTrue(solution.judgeCircle(moves));
    }

    @Test
    void example2() {
        String moves = "LL";
        assertFalse(solution.judgeCircle(moves));
    }
}