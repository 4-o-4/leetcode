package easy.array

fun canAliceWin(nums: IntArray): Boolean {
    var Alice = 0
    var Bob = 0

    for (n in nums) {
        if (n >= 10)
            Bob += n
        else
            Alice += n
    }
    return Alice != Bob
}
