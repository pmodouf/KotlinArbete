package Main

import java.io.File

fun main() {


    var x = 0  // horizontal position
    var y = 0  // depth

    // read input from file
    val input = File("src/main/ÖvnUpgKotlin/Aoc2.txt").readLines()

    for (line in input) {
        val parts = line.split(" ")
        val command = parts[0]
        val value = parts[1].toInt()

        when (command) {
            "forward" -> x += value
            "up" -> y -= value
            "down" -> y += value
        }
    }

    val result = x * y
    println(result)



    fun main2() {
        var horz = 0  // horizontal position
        var dep = 0  // depth
        val file = File("src/main/ÖvnUpgKotlin/Aoc2.txt")
        val inputs = file.useLines { it.toList() }

        val results = input.fold(Pair(0, 0)) { (x, y), line ->
            val (command, value) = line.split(" ")
            when (command) {
                "forward" -> Pair(x + value.toInt(), y)
                "up" -> Pair(x, y - value.toInt())
                "down" -> Pair(x, y + value.toInt())
                else -> Pair(x, y)
            }
        }

        println(results.first * results.second)


    }
    println(main2())
}


