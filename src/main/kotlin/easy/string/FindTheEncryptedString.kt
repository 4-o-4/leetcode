package easy.string

fun getEncryptedString(s: String, k: Int): String {
    val i = k % s.length

    return s.substring(i) + s.substring(0, i)
}
