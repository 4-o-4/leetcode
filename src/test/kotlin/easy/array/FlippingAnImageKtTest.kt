package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FlippingAnImageKtTest {
    @Test
    fun example1() {
        val image = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 0, 0))
        assertArrayEquals(
            arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)),
            flipAndInvertImage(image)
        )
    }
}