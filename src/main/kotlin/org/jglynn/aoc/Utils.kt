package org.jglynn.aoc

import java.io.File
import java.net.URI

/**
 * Reads lines from the given input txt file.
 */
internal object Utils {

    fun resourceAsString(fileName: String): String =
        File(fileName.toURI()).readText()

    fun resourceAsListOfString(fileName: String): List<String> =
        File(fileName.toURI()).readLines()

    fun loadAsListOfPairs(name: String): List<Pair<String,String>> =
        resourceAsListOfString(name).map {
            it.substringBefore(' ').trim() to it.substringAfter(' ').trim()
        }

    fun loadAsListOfInt(name: String): List<Int> {
        return resourceAsListOfString(name).map { it.toIntOrNull() ?: -1}
    }

    fun loadAsListOfStringIntPair(name: String): List<Pair<String,Int>> {
        return resourceAsListOfString(name).map() {
            val (direction, value) = it.split(" ")
            Pair(direction, value.toInt())
        }
    }

    fun String.substringBetween(char1: String, char2: String): String =
        this.substringAfter(char1).substringBefore(char2)

    fun String.toURI(): URI =
        Utils.javaClass.classLoader.getResource(this)?.toURI() ?: throw IllegalArgumentException("Cannot find Resource: $this")
 }