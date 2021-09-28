package com.zeeshan.test

fun main(args: Array<String>) {


    val input = intArrayOf(2, 3, 4, 6, 9, 5, 1)
    println("input is:")
    input.onEach {
        print("\t $it")
    }

    simpleReverse(0, input.size -1 , input)

    print("\n \n output is:")
    input.onEach {
        print("\t $it")
    }
}


private fun simpleReverse(start: Int, end: Int, array: IntArray) {

    var i = start
    var j = end
    while (i < j) {
        array[i] = array[i] + array[j]
        array[j] = array[i] - array[j]
        array[i] = array[i] - array[j]
        i++
        j--
    }
}