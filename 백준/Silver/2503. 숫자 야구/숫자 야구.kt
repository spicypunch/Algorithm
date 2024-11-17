import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val questions = mutableListOf<Pair<String, Pair<Int, Int>>>()

    repeat(n) {
        val (question, strike, ball) = br.readLine().split(" ")
        questions.add(question to (strike.toInt() to ball.toInt()))
    }

    var count = 0
    for (i in 123..987) {
        val numStr = i.toString()
        if (numStr.length != 3 || numStr.contains('0')) continue
        if (numStr[0] == numStr[1] || numStr[0] == numStr[2] || numStr[1] == numStr[2]) continue

        var possible = true
        for ((question, strikeBall) in questions){
            val (strike, ball) = strikeBall
            val calculatedStrikeBall = calculateStrikeBall(numStr, question)
            if (calculatedStrikeBall != strikeBall) {
                possible = false
                break
            }
        }

        if (possible) {
            count++
        }
    }

    println(count)
}

fun calculateStrikeBall(secret: String, guess: String): Pair<Int, Int> {
    var strike = 0
    var ball = 0

    for (i in 0..2) {
        if (secret[i] == guess[i]) {
            strike++
        } else if (secret.contains(guess[i])) {
            ball++
        }
    }

    return strike to ball
}