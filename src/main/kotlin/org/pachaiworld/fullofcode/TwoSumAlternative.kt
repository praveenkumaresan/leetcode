package org.pachaiworld.fullofcode

fun getIndexOfTwoNum(nums: String, targetNumber: String): IntArray{
    val inputArray : Array<Int> = nums.split(",").map { it.toInt() }.toTypedArray()
    val outputArray = IntArray(2)

    val indexAndDifferenceMap = mutableMapOf<Int, Int>()

    for (i in inputArray.indices){
        if (indexAndDifferenceMap.containsKey(inputArray[i])){
            outputArray[0] = indexAndDifferenceMap[inputArray[i]]!!
            outputArray[1] = i
            break
        }
        else {
            indexAndDifferenceMap[targetNumber.toInt() - inputArray[i]] = i
        }
    }

    return outputArray
}

fun main() {
    println("Enter the array of integers")
    val nums = readlnOrNull() ?: println("input is empty ")
    println("Enter the target number")
    val targetNumber = readlnOrNull() ?: println("target number is empty ")
    println("index numbers are ${getIndexOfTwoNum(nums.toString(), targetNumber.toString()).contentToString()}")
}