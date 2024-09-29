package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestOddNumberInStringKtTest {
    @Test
    fun example1() {
        val num = "52"
        assertEquals("5", largestOddNumber(num))
    }

    @Test
    fun example2() {
        val num = "4206"
        assertEquals("", largestOddNumber(num))
    }

    @Test
    fun example3() {
        val num = "35427"
        assertEquals("35427", largestOddNumber(num))
    }

    @Test
    fun example4() {
        val num = "5"
        assertEquals("5", largestOddNumber(num))
    }

    @Test
    fun example5() {
        val num = "239537672423884969653287101"
        assertEquals("239537672423884969653287101", largestOddNumber(num))
    }
}