package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CrawlerLogFolderKtTest {
    @Test
    fun example1() {
        val logs = arrayOf("d1/", "d2/", "../", "d21/", "./")
        assertEquals(2, minOperations(logs))
    }

    @Test
    fun example2() {
        val logs = arrayOf("d1/", "../", "../", "../")
        assertEquals(0, minOperations(logs))
    }
}