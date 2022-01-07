import java.io.File

fun day2() {
    println("Day 2:")

    val commands = File("src/main/kotlin/day2-input.txt").readLines()
    var horizontal = 0
    var depth = 0

    for (i in commands.indices) {
        val command = commands[i].split(" ")
        if (command.size != 2) throw RuntimeException("Invalid command at line ${i + 1}: '$command'")

        val direction = command[0]
        val distance = command[1].toInt()

        when (direction) {
            "forward" -> horizontal += distance
            "up" -> depth -= distance
            "down" -> depth += distance
            else -> throw RuntimeException("Invalid command at line ${i + 1}: '$command'")
        }

        if (depth < 0) depth = 0
    }

    println("Horizontal position: $horizontal")
    println("Depth: $depth")
    println("Horizontal x Depth = ${horizontal * depth}")
}