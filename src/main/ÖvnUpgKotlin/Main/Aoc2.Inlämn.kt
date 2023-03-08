package Main

import java.io.File


fun main() {


    var x = 0  // horizontal position
    var y = 0  // depth

    // läsa input från fil
    val input = File("src/main/ÖvnUpgKotlin/Aoc2.txt").readLines()
//for loop följt av en split för att kunna separera kommando ifrån värdet på y eller x
    for (line in input) {
        val parts = line.split(" ")
        val command = parts[0]
        val value = parts[1].toInt()
//vad som ska ske beroende på kommando
        when (command) {
            "forward" -> x += value
            "up" -> y -= value
            "down" -> y += value
        }
    }

    val result = x * y
    println(result)
    println(nextPart())
}

fun nextPart(){
        var horz = 0 // horizontal position
        var dep = 0 // depth
        var aim = 0 // aim

        // read input from file
        val input = File("src/main/ÖvnUpgKotlin/Aoc2.txt").readLines()

        for (line in input) {
            val parts = line.split(" ")
            val command = parts[0]
            val value = parts[1].toInt()

            when (command) {
                "forward" -> {
                    horz += value
                    dep += aim * value
                }
                "up" -> aim -= value
                "down" -> aim += value
            }
        }

        val result2 = horz * dep
        println(result2)
    }




