package easy.hash_table

fun distributeCandies(candyType: IntArray): Int {
    val types = candyType.size / 2
    val size = candyType.toSet().size

    return if (types >= size) size else types
}
