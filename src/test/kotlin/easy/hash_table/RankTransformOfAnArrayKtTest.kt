package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RankTransformOfAnArrayKtTest {
    @Test
    fun example1() {
        val arr = intArrayOf(40, 10, 20, 30)
        assertArrayEquals(intArrayOf(4, 1, 2, 3), arrayRankTransform(arr))
    }

    @Test
    fun example2() {
        val arr = intArrayOf(100, 100, 100)
        assertArrayEquals(intArrayOf(1, 1, 1), arrayRankTransform(arr))
    }

    @Test
    fun example3() {
        val arr = intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12)
        assertArrayEquals(intArrayOf(5, 3, 4, 2, 8, 6, 7, 1, 3), arrayRankTransform(arr))
    }
}