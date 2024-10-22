package easy.array

class DesignAnOrderedStream(n: Int) {
    private var ptr = 0
    val arr: Array<String?>

    init {
        arr = Array(n) { null }
    }

    fun insert(idKey: Int, value: String): List<String> {
        val tmp = mutableListOf<String>()

        arr[idKey - 1] = value
        for (i in ptr..arr.lastIndex) {
            ptr = i
            if (arr[i].isNullOrEmpty()) {
                break
            }
            tmp.add(arr[i]!!)
        }
        return tmp
    }
}
