package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GoatLatinKtTest {
    @Test
    fun example1() {
        val sentence = "I speak Goat Latin"
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin(sentence))
    }

    @Test
    fun example2() {
        val sentence = "The quick brown fox jumped over the lazy dog"
        assertEquals(
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
            toGoatLatin(sentence)
        )
    }
}