package com.example

import java.io.FileNotFoundException

fun main() {

    val inputStream =
        object {}.javaClass.getResourceAsStream("/testing.txt")
            ?: throw FileNotFoundException("testing.txt not found")

    val lines = inputStream.bufferedReader().readLines()

    println("testing.txt content:\n${lines.joinToString("\n")}")
}
