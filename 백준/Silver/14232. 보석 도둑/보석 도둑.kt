import kotlin.math.sqrt

fun main() {
    var n = readln().toLong()
    val list = mutableListOf<Long>()

    for (i in 2..sqrt(n.toDouble()).toLong()) {
        while (n % i == 0L) { // n이 i로 나누어 떨어지는 동안 반복
            list.add(i) 
            n /= i
        }
    }

    if (n > 1) { // 마지막으로 남은 n이 1보다 크면 소인수이므로 추가
        list.add(n) 
    }

    println(list.size)
    println(list.joinToString(" "))
}