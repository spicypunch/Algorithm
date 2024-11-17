import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val candies = br.readLine().toInt()
    var A = 0
    var B = 0
    var C = 0

    var answer = 0
    for (a in 1..candies) {
        for (b in 1..candies) {
            for (c in 1..candies) {
                if (a + b + c == candies) {
                    if (a >= b + 2) {
                        if (a != 0 && b != 0 && c != 0) {
                            if (c % 2 == 0) {
                                answer += 1
                            }
                        }
                    }
                }
            }
        }
    }
    print(answer)
}