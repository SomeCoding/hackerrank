import java.util.*

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    fun Array<Int>.rotate(k: Int): Array<Int> = (takeLast(k) + take(size - k)).toTypedArray()

    return Array(queries.size) { a.rotate(k % a.size)[queries[it]] }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nkq = scan.nextLine().split(" ")
    val n = nkq[0].trim().toInt()
    val k = nkq[1].trim().toInt()
    val q = nkq[2].trim().toInt()
    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val queries = Array(q) { 0 }
    for (i in 0 until q) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}
