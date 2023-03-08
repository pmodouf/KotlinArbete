package Main

import java.io.File

fun main() {
    // Läser in lösenord från fil och skapar instanser av PasswordWithPolicy
    val passwords = File("src/main/ÖvnUpgKotlin/Main/Aoc2020.txt")
        .readLines()
        .map(PasswordWithPolicy::parse)

    // Räknar antalet lösenord som uppfyller del 1

    val validPasswordsPartTwo = passwords.count { it.validatePartTwo() }

    // Skriver ut antalet giltiga lösenord

    println("Antal giltiga lösenord: $validPasswordsPartTwo")
}

data class PasswordWithPolicy(
    val password: String,
    val range: IntRange,
    val letter: Char
) {
    // Parsar en sträng på formatet "<min>-<max> <bokstav>: <lösenord>" till en instans av PasswordWithPolicy
    companion object {
        fun parse(input: String): PasswordWithPolicy {
            val parts = input.split(" ")
            val (min, max) = parts[0].split("-").map { it.toInt() }
            val letter = parts[1].substring(0, 1).toCharArray()[0]
            val password = parts[2]
            return PasswordWithPolicy(password, min..max, letter)
        }
    }


    // Kontrollerar om lösenordet uppfyller policyn för del två
    fun validatePartTwo(): Boolean =
        (password[range.first - 1] == letter) xor (password[range.last - 1] == letter)
}
