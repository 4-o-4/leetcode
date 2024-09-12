package easy.string

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DivideStringIntoGroupsOfSizeKKtTest {
    @Test
    fun example1() {
        val s = "abcdefghi"
        val k = 3
        val fill = 'x'
        assertArrayEquals(arrayOf("abc", "def", "ghi"), divideString(s, k, fill))
    }

    @Test
    fun example2() {
        val s = "abcdefghij"
        val k = 3
        val fill = 'x'
        assertArrayEquals(arrayOf("abc", "def", "ghi", "jxx"), divideString(s, k, fill))
    }
}