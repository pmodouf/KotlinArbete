package Aoc

import java.io.File

fun main() {
    val input = File("src/main/ÖvnUpgKotlin/Aoc/Aoc2020.txt").readLines()

    var validPasswords = 0
    for (line in input) {
        val parts = line.split(" ")
        val (min, max) = parts[0].split("-").map { it.toInt() }
        val char = parts[1].substring(0, 1)
        val password = parts[2]
        val count = password.count { it.toString() == char }
        if (count in min..max) {
            validPasswords++
        }
    }
    println("Number of valid passwords: $validPasswords")
    println(part2())


}

fun part2() {

        val input = File("src/main/ÖvnUpgKotlin/Aoc/Aoc2020.txt").readLines()

        val validPasswords = input.count { line ->
            val parts = line.split(" ")
            val (min, max) = parts[0].split("-").map { it.toInt() }
            val char = parts[1].substring(0, 1)
            val password = parts[2]
            val count = password.count { it.toString() == char }
            count in min..max
        }
        println("Number of valid passwords: $validPasswords")
    }



