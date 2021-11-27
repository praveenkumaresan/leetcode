package org.pachaiworld.fullofcode

fun checkPalindrome(x: Int): Boolean{
    if (x < 0){
        return false
    }

    var number = x
    var reverseNumber = 0

    while (number > 0){

        /**
         *  reverseNumber = reverseNumber * 10  + number  % 10
         *  number /= 10
         */

        reverseNumber = reverseNumber * 10  + number  % 10
        number /= 10
    }

    return x == reverseNumber
}

fun main(){
    println("Enter the number to check plaindrome")
    val numString = readlnOrNull() ?: println("user input is empty")
    val num = numString.toString().toInt()
    println("Palindrome check on $num is ${checkPalindrome(num)}")
}