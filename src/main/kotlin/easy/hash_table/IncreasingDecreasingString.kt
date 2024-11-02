package easy.hash_table

fun sortString(s: String): String {
    val sb = StringBuilder(s.length)
    val set = HashSet<Int>()
    var tmp: Char

    val array = s.toCharArray()
    array.sort()
    while (set.size != s.length) {
        tmp = 'A'
        for (i in array.indices) {
            if (set.contains(i)) continue
            if (array[i] != tmp) {
                tmp = array[i]
                sb.append(tmp)
                set.add(i)
            }
        }
        tmp = 'A'
        for (i in array.lastIndex downTo 0) {
            if (set.contains(i)) continue
            if (array[i] != tmp) {
                tmp = array[i]
                sb.append(tmp)
                set.add(i)
            }
        }
    }
    return sb.toString()
}
