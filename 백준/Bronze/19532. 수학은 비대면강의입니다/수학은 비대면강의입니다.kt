import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputLine = br.readLine()
    val numbers = inputLine.split(" ")


    var x = 0
    var y = 0

    for (i in -999..999) {
        for (j in -999..999) {
            if ((numbers[0].toInt() * i) + (numbers[1].toInt() * j) == numbers[2].toInt() && (numbers[3].toInt() * i) + (numbers[4].toInt() * j) == numbers[5].toInt()) {
                x = i
                y = j
            }
        }

    }

    println("$x $y")
}