import java.util.*

fun sockMerchant(array: Array<Int>): Int = array
        .groupingBy { it }
        .eachCount()
        .mapValues { it.value / 2 }
        .values.sum()

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val array = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = sockMerchant(array)
    println(result)
}
