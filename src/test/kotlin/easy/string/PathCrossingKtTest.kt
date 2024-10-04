package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PathCrossingKtTest {
    @Test
    fun example1() {
        val path = "NES"
        assertFalse(isPathCrossing(path))
    }

    @Test
    fun example2() {
        val path = "NESWW"
        assertTrue(isPathCrossing(path))
    }
}