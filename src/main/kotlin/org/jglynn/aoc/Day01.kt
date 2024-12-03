package org.jglynn.aoc

import kotlin.math.absoluteValue

class Day01(private val input: List<String>) {

    fun solvePart1(): Int {
        val (firstColumn, secondColumn) = parseInput()
        val firstSorted = firstColumn.sorted()
        val secondSorted = secondColumn.sorted()
        return firstSorted.mapIndexed { index, it ->
                (it - secondSorted[index]).absoluteValue
            }.sum()
    }

    fun solvePart2(): Int {
        val (firstColumn, secondColumn) = parseInput()
        val counts = secondColumn.groupingBy { it }.eachCount()
        return firstColumn.sumOf { it * counts.getOrDefault(it, 0) }
    }

    private fun parseInput() = input.map {
        it.substringBefore(" ").trim().toInt() to
                it.substringAfter(" ").trim().toInt()
    }.unzip()

}
