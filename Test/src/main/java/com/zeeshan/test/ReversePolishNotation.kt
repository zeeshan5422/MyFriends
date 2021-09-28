package com.zeeshan.test

import java.util.*

/**
 * Created by ZEESHAN on 28,September,2021
 */
class ReversePolishNotation {
}


fun main(args: Array<String>) {

//    val tokens: Array<String> = arrayOf("2", "1", "+", "3", "*") // output is 9
    val tokens: Array<String> = arrayOf("4", "13", "5", "/", "+") // output is 6
    println("output is: ${tokens.contentToString()}")

    val output = evaluateRPN(tokens)

    println("output is: $output")
}

fun evaluateRPN(tokens: Array<String>): Int {

    val operators = "+-*/"
    val stack: Stack<String> = Stack()

    tokens.onEach {
        if (!operators.contains(it)) {
            stack.push(it)
        } else {
            val a = stack.pop().toInt()
            val b = stack.pop().toInt()
            when (it) {
                "+" -> {
                    stack.push((a + b).toString())
                }
                "-" -> {
                    stack.push((b - a).toString())
                }
                "*" -> {
                    stack.push((a * b).toString())
                }
                "/" -> {
                    stack.push((b / a).toString())
                }
            }
        }
    }
    return stack.peek().toInt()
}
