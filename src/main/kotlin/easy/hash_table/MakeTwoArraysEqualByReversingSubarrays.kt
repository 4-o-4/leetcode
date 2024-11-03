package easy.hash_table

fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
    target.sort()
    arr.sort()

    return target.contentEquals(arr)
}
