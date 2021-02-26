import java.util.*

fun viralAdvertising(n: Int): Int {
    var liked = 2.also { if (n == 1) return it }
    return (2..n).fold(liked) { acc, _ ->
        liked = liked * 3 / 2
        acc + liked
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val result = viralAdvertising(n)
    println(result)
}
