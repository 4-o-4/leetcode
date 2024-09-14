package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfPushesToTypeWordKtTest {
    @Test
    fun example1() {
        val word = "abcde"
        assertEquals(5, minimumPushes(word))
    }

    @Test
    fun example2() {
        val word = "xycdefghij"
        assertEquals(12, minimumPushes(word))
    }

    @Test
    fun example3() {
        val word = "xycdefghxxij"
        assertEquals(14, minimumPushes(word))
    }
}