package Aoc

import java.io.File

fun main() {
    val input = File("src/main/ÖvnUpgKotlin/Aoc/Aoc2020.txt").readLines()

    val validPasswords = input.count { line ->
        val parts = line.split(" ")
        val (pos1, pos2) = parts[0].split("-").map { it.toInt() }
        val char = parts[1].substring(0, 1)
        val password = parts[2]
        (password[pos1 - 1].toString() == char) xor (password[pos2 - 1].toString() == char)
    }
    println("Number of valid passwords: $validPasswords")
}
fun second(){


}
