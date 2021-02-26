import java.util.*

fun biggerIsGreater(w: String): String {

    val word = w.asSequence().map { it.toInt() }.toMutableList()

    for (index in (w.length - 1) downTo 1) {
        for (index2 in (index - 1) downTo 0) {
            if (word[index] > word[index2]) {
                word[index] = word[index2].also { word[index2] = word[index] }
                return (word.take(index2 + 1) + word.subList(index2 + 1, word.size).sorted())
                        .map { it.toChar() }
                        .joinToString("")
            }
        }
    }
    return "no answer"
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val T = scan.nextLine().trim().toInt()
    for (TItr in 1..T) {
        val w = scan.nextLine()
        val result = biggerIsGreater(w)
        println(result)
    }
}
//ehdegnmorgafrjxvksc
//ehdegnmorgafrjxvsck