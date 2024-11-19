class Solution {
    fun solution(numbers: String): Int {
        val allNumbers = reCombined(numbers).toList()
    var primeCount = 0
    for (number in allNumbers) {
        if (number > 1 && isPrime(number)) {
            primeCount++
        }
    }
        return primeCount
    }
}

fun reCombined(numbers: String): MutableSet<Int> {

    val digits = numbers.toCharArray().map { it.toString() }
    val allNumbers = mutableSetOf<Int>()

    fun generateNumbers(currentNumber: String, remainingDigits: List<String>) {
        allNumbers.add(currentNumber.toIntOrNull() ?: 0)
        if (remainingDigits.isEmpty()) return
        for (i in remainingDigits.indices) {
            val nextNumber = currentNumber + remainingDigits[i]
            val nextRemainingDigits = remainingDigits.toMutableList().also { it.removeAt(i) }
            generateNumbers(nextNumber, nextRemainingDigits)
        }
    }

    generateNumbers("", digits)



    return allNumbers
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..kotlin.math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}