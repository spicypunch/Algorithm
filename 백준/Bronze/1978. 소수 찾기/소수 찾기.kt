import kotlin.math.sqrt

fun main() {
    val n = readln().toInt()
    val m = readln().split(" ").map { it.toInt() }
    var pNum = 0

    for (i in m) {
        if (i == 1) {
            continue
        }

        var isPrime = true
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            pNum++
        }
    }

    println(pNum)
}