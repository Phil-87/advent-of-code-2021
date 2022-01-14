import java.io.File

fun day3() {
    println("Day 3:")

    val inputs = File("src/main/kotlin/day3-input.txt").readLines()
    val numRows = inputs.size
    val numColumns = inputs[0].length
    val totals = mutableListOf<Int>()

    for (i in 0 until numColumns)
        totals.add(0)

    for (i in inputs.indices) {
        val input = inputs[i]
        if (input.length != numColumns) throw RuntimeException("Invalid binary number length at line ${i + 1}: '$input'")

//        val inputBits = mutableListOf<Int>()
//        for (j in 0 until numColumns) {
//            val bit = input[j].code
//            if (bit != 0 && bit != 1) throw RuntimeException("Invalid bit at line ${i + 1}: '$input'")
//            inputBits.add(bit)
//        }
        val inputBits = input.map { it.toString().toInt() }

        for (k in 0 until numColumns) {
            totals[k] += inputBits[k]
        }
    }

    println("Output here")
}