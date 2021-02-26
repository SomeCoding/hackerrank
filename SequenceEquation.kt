import java.util.*

fun Array<Int>.permutationEquation(): Array<Int> =
        Array(size) { n -> indexOf(indexOf(n + 1) + 1) + 1 }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = p.permutationEquation()
    println(result.joinToString("\n"))
}