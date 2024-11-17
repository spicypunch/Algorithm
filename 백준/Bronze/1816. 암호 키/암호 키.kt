package com.example.algorithm

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val count = br.readLine().toInt()
    val results = mutableListOf<String>()

    repeat(count) {
        val num = br.readLine().toLong()
        for(i in  2..1000001) {
            if (num % i == 0L) {
                results.add("NO")
                break
            } else if (i == 1000000) {
                results.add("YES")
            }
        }

    }

    results.forEach { println(it) }
}