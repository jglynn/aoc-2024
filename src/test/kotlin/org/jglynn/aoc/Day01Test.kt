
package org.jglynn.aoc

import org.assertj.core.api.Assertions.assertThat
import org.jglynn.aoc.Utils.resourceAsListOfString
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1")
class Day01Test {

    // Arrange
    private val testData = resourceAsListOfString("Day01_test.txt")
    private val realData = resourceAsListOfString("Day01_real.txt")

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {

            val answer = Day01(testData).solvePart1()

            // Assert
            assertThat(answer).isEqualTo(11)
        }

        @Test
        fun `Actual answer`() {

            val answer = Day01(realData).solvePart1()

            println("Answer = $answer")
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {

            val answer = Day01(testData).solvePart2()

            // Assert
            assertThat(answer).isEqualTo(31)
        }

        @Test
        fun `Actual answer`() {

            val answer = Day01(realData).solvePart2()

            println("Answer = $answer")
        }
    }


}