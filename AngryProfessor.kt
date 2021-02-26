import java.util.*

fun angryProfessor(k: Int, a: Array<Int>): String = if (a.count { it <= 0 } >= k) "NO" else "YES"

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    repeat(t) {
        val nk = scan.nextLine().split(" ")
        val n = nk[0].trim().toInt()
        val k = nk[1].trim().toInt()
        val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        val result = angryProfessor(k, a)
        println(result)
    }
}
