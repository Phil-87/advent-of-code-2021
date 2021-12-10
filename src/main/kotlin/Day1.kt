import java.io.File

fun day1() {
    println("Day 1:")

    val depths = File("src/main/kotlin/day1-input.txt").readLines()
    var numIncreases = 0

    for (i in depths.indices) {
        if (i > 0 && i + 2 < depths.size) {
            if (depths[i].toInt() + depths[i + 1].toInt() + depths[i + 2].toInt() >
                depths[i - 1].toInt() + depths[i].toInt() + depths[i + 1].toInt()
            )
                numIncreases++
        }
    }

    println("Number of increases: $numIncreases")
}