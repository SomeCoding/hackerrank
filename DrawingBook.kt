import java.util.*

fun pageCount(n: Int, p: Int): Int {
    val list = generateSequence(Pair(0 ,1)) {Pair(it.second + 1, it.second + 2)}
            .take(n / 2 + 1).toList()
    println(list)
    val index = list.indexOfFirst { it.first == if (p % 2 == 0) p else p - 1 }
    println("Index: $index")
    return minOf(index, (list.size - 1) - index)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val p = scan.nextLine().trim().toInt()
    val result = pageCount(n, p)
    println(result)
}