import java.util.*

fun saveThePrisoner(n: Int, m: Int, s: Int): Int =
        (s - 1 + if (m % n == 0) n else m % n)
                .let { if (it == n) it else it % n }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")
        val n = nms[0].trim().toInt()
        val m = nms[1].trim().toInt()
        val s = nms[2].trim().toInt()
        val result = saveThePrisoner(n, m, s)
        println(result)
    }
}
