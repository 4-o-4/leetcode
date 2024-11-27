package easy.hash_table

fun containsDuplicate(nums: IntArray): Boolean {
    val set = nums.toSet()
    return set.size != nums.size
}
