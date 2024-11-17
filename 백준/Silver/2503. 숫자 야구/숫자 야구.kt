import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val count = br.readLine().toInt()
    val list = mutableListOf<List<Int>>()

    repeat(count) {
        val line = br.readLine().split(" ").map { it.toInt() }
        list.add(line)
    }

    var answerCount= 0

    for (i in 1..9) {
        for (j in 1..9) {
            for (k in 1..9) {
                if (i == j || j == k || k == i) continue // 중복된 숫자 제외

                val sampleNumber = "$i$j$k" // 후보 숫자 생성

                var isPossible = true
                for (arr in list) {
                    val number = arr[0].toString()
                    val strike = arr[1]
                    val ball = arr[2]

                    var calculatedStrike = 0
                    var calculatedBall = 0

                    for (i in sampleNumber.indices) {
                        if (sampleNumber[i] == number[i]) {
                            calculatedStrike++
                        } else if (number.contains(sampleNumber[i])) {
                            calculatedBall++
                        }
                    }

                    if (strike != calculatedStrike || ball != calculatedBall) {
                        isPossible = false
                        break
                    }
                }

                if (isPossible) {
                    answerCount++
                }
            }
        }
    }

    println(answerCount)
}
