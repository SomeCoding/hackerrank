import java.util.*

fun beautifulDays(i: Int, j: Int, k: Int): Int = (i..j)
        .map { (it - it.toString().reversed().toInt()) % k == 0 }
        .count { it }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val ijk = scan.nextLine().split(" ")
    val i = ijk[0].trim().toInt()
    val j = ijk[1].trim().toInt()
    val k = ijk[2].trim().toInt()
    val result = beautifulDays(i, j, k)
    println(result)
}