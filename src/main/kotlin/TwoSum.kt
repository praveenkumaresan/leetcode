fun getIndexOfNums(nums: IntArray, targetNum: Int): IntArray {

    // Array to store result
    val result = IntArray(2)

    // Map to index difference from target as key and its position as value
    val indexAndDifferenceMap = mutableMapOf<Int, Int>()

    run loop@{
        nums.indices.forEach {
            if (indexAndDifferenceMap.containsKey(nums[it])) {
                result[0] = it
                result[1] = indexAndDifferenceMap[nums[it]]!!
                return@loop
            } else {
                indexAndDifferenceMap[targetNum - nums[it]] = it
            }
        }
    }

    return result
}

fun main() {

    println("Enter the array of integers .... ")
    val numsInput = readlnOrNull() ?: println("user input is empty")
    val numsInputAsList = numsInput.toString().split(",").asInts()

    println("Enter the target number..... ")
    val targetInput = readlnOrNull() ?: println("target input is empty")
    val target = targetInput.toString()
    println("Answer is ${getIndexOfNums(numsInputAsList, target.toInt()).contentToString()}")
}

fun List<String>.asInts() = this.map { it.toInt() }.toIntArray()

/**
 * 1. Handle edge cases invalid inputs
 */
