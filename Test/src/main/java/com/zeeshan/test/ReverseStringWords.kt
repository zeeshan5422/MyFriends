package com.zeeshan.test

fun main(args: Array<String>) {

    val input = "The sky i,s bl!ue"
    println(" ${input.length} input is: $input \n")

    val output: String = reverseString(input)
    val output2 = simpleReverse(0, input.length - 1, input.toCharArray())

    print(" \n ${output.length} output is: $output")
    print(" \n ${output2.length} output2 is: $output2")
}

private fun reverseString(input: String): String {

    if (input.isEmpty()) {
        return ""
    }
    val reversed: List<String> = input.split(" ").reversed()
    var output = ""
    reversed.onEach { output = output.plus(" $it") }

    return output.trim()
}

private fun simpleReverse(start: Int, end: Int, array: CharArray): String {

    if (array.isEmpty() || start >= end || (start > array.size - 1 && start < end)) {
        return ""
    }

    reverseString(start,end,array)

    var output = ""
    String(array).split(" ").onEach {
        it.apply {
            output+= reverseString(0, this.length - 1, this.toCharArray()).prependIndent(" ")
        }
    }


//    var output: String = ""
//    array.map {
//        output = output.plus(it)
//    }
    return output.trim()


//    return String(array)
//    return array.concatToString()


}

fun reverseString(start: Int, end: Int, charArray: CharArray): String {
    var i = start
    var j = end
    while (i < j) {
        val temp: Char = charArray[i]
        charArray[i] = charArray[j]
        charArray[j] = temp
        i++
        j--
    }
    return charArray.concatToString()
}



