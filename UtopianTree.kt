import java.util.*

fun utopianTree(n: Int): Int = (0..n).fold(0) { height, cycle ->
    if (cycle % 2 == 0) height + 1 else height * 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    repeat(t) {
        val n = scan.nextLine().trim().toInt()
        val result = utopianTree(n)
        println(result)
    }
}
