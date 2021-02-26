import java.util.*

fun countingValleys(s: String): Int {
    val list = s.map { if (it == 'U') 1 else -1 }
    var counter = 0
    list.fold(0) { sum, i ->
        if (i == -1 && sum == 0) counter++
        sum + i
    }
    return counter
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val s = scan.nextLine()
    println(countingValleys(s))
}