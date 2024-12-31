package easy.sorting

fun sortArrayByParity(nums: IntArray): IntArray {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    for (n in nums) {
        if (n % 2 == 0)
            list1.add(n)
        else
            list2.add(n)
    }
    list1.sort()
    for (i in list1.indices)
        nums[i] = list1[i]
    var j = list1.size
    for (n in list2)
        nums[j++] = n
    return nums
}
