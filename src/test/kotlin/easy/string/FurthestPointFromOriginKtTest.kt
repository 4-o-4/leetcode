package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FurthestPointFromOriginKtTest {
    @Test
    fun example1() {
        val moves = "L_RL__R"
        assertEquals(3, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example2() {
        val moves = "_R__LL_"
        assertEquals(5, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example3() {
        val moves = "_______"
        assertEquals(7, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example4() {
        val moves = "LR"
        assertEquals(0, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example5() {
        val moves = "LLR"
        assertEquals(1, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example6() {
        val moves = "LR_"
        assertEquals(1, furthestDistanceFromOrigin(moves))
    }

    @Test
    fun example7() {
        val moves = "LLRR__"
        assertEquals(2, furthestDistanceFromOrigin(moves))
    }
}