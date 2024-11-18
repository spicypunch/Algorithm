fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    recur(0, "", n, m, mutableListOf())
}

private fun recur(number: Int, output: String, n: Int, m: Int, used: MutableList<Int>) {
    if (number == m) {
        println(output.trim())
        return
    }

    for (i in 1..n) {
        if (i in used) continue
        used.add(i)
        recur(number + 1, "$output$i ", n, m, used)
        used.remove(i)
    }
}
