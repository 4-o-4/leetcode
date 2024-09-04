package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckIfTwoChessboardSquaresHaveTheSameColorKtTest {
    @Test
    fun example1() {
        val coordinate1 = "a1"
        val coordinate2 = "c3"
        assertTrue(checkTwoChessboards(coordinate1, coordinate2))
    }

    @Test
    fun example2() {
        val coordinate1 = "a1"
        val coordinate2 = "h3"
        assertFalse(checkTwoChessboards(coordinate1, coordinate2))
    }
}