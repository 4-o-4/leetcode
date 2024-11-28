package easy.hash_table

fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
    val aliceMap = mutableMapOf<Int, Int>()
    val bobMap = mutableMapOf<Int, Int>()
    var tmp = 1
    var tmpS: Int

    val aliceSum = aliceSizes.sum()
    val bobSum = bobSizes.sum()
    val size = (aliceSum + bobSum) / 2
    aliceSizes.forEach { aliceMap.compute(it) { _, v -> v?.inc() ?: 1 } }
    bobSizes.forEach { bobMap.compute(it) { _, v -> v?.inc() ?: 1 } }
    while (true) {
        if (aliceMap.containsKey(tmp)) {
            tmpS = aliceSum - tmp
            if (bobMap.containsKey(size - tmpS))
                break
        }
        tmp++
    }
    return intArrayOf(tmp, size - tmpS)
}
