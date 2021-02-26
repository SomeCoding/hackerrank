fun pickingNumbers(a: Array<Int>): Int {
    val map = a.groupingBy { it }.eachCount()
    var counter = 0
    map.keys.sorted().let { keys ->
        (0 until keys.size - 1).forEach { i ->
            if (keys[i + 1] - keys[i] == 1) counter = maxOf(map.getValue(keys[i]) + map.getValue(keys[i + 1]), counter)
        }
    }
    return maxOf(counter, map.maxBy { it.value }!!.value)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
