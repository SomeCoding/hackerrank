import java.util.*

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
        val totals = mutableListOf<Int>()
        keyboards.forEach { keyboard ->
            drives.forEach { drive ->
                val total = keyboard + drive
                if (total <= b) totals.add(total)
            }
        }
        return totals.max() ?: -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val bnm = scan.nextLine().split(" ")
    val b = bnm[0].trim().toInt()
    val n = bnm[1].trim().toInt()
    val m = bnm[2].trim().toInt()
    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    println(getMoneySpent(keyboards, drives, b))
}
