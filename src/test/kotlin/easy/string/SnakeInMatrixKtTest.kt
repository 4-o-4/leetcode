package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SnakeInMatrixKtTest {
    @Test
    fun example1() {
        val n = 2
        val commands = listOf("RIGHT", "DOWN")
        assertEquals(3, finalPositionOfSnake(n, commands))
    }

    @Test
    fun example2() {
        val n = 3
        val commands = listOf("DOWN", "RIGHT", "UP")
        assertEquals(1, finalPositionOfSnake(n, commands))
    }
}