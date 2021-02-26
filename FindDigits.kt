import java.lang.Character.getNumericValue
import java.util.*

fun findDigits(n: Int): Int = n.toString()
        .toCharArray()
        .map { getNumericValue(it) }
        .filter { it > 0 }
        .fold(0) { acc, i -> if (n % i == 0) acc + 1 else acc }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()
        val result = findDigits(n)
        println(result)
    }
}
