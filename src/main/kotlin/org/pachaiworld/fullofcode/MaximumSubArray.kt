package org.pachaiworld.fullofcode

fun maxSubArray(nums: IntArray): Int {
    var maximumValue = Int.MIN_VALUE
    var currentValue = 0
    nums.forEach {
        currentValue = maxOf(currentValue + it, it)
        maximumValue = maxOf(maximumValue, currentValue)
    }
    return maximumValue
}

fun main() {
    println("enter the array of nums ")
    val numsInput = readlnOrNull() ?: println("user input is empty")
    val numsInputAsList = numsInput.toString().split(",").asInts()

    println("Answer is ${maxSubArray(numsInputAsList)}")
}

fun List<String>.asInts() = this.map { it.toInt() }.toIntArray()