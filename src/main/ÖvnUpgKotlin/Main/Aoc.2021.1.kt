package Aoc

import java.io.File


fun main() {
    val depths = File("src/main/ÖvnUpgKotlin/Aoc/Aoc.2021.1.txt").readLines().map { it.toInt() }

    var count = 0
    var previous = -1 // Initialize to -1 since there is no previous measurement for the first one.

    for (depth in depths) {
        if (depth > previous) {
            count++
        }
        previous = depth
    }

    println("Number of measurements larger than the previous measurement: $count")
}

//GÖÖÖR KLAAAART