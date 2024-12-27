fun main() {
    var n = readln().toInt()

    if (n == 1) return

    while (n % 2 == 0) {
        println(2)
        n /= 2
    }

    var divisor = 3
    while (divisor * divisor <= n) {
        if (n % divisor == 0) {
            println(divisor)
            n /= divisor
        } else {
            divisor += 2
        }
    }

    if (n > 1) {
        println(n)
    }
}