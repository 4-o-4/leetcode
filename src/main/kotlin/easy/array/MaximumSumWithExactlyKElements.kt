package easy.array

fun maximizeSum(nums: IntArray, k: Int): Int {
    var max = 0

    nums.sort()
    max = nums.last() * k
    return max + k * (k - 1) / 2
}
