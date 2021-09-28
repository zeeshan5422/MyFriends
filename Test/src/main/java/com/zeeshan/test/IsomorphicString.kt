package com.zeeshan.test

/**
 * Created by ZEESHAN on 28,September,2021
 */
class IsomorphicString {
}

// NOTE:: Two strings are isomorphic if and only if characters in string a can be replaced to get t.

fun main(args: Array<String>) {

/*
    // Below input will give true result
    val a = "egg"
    val b = "add"
*/

    // Below input will give false result
    val a = "foo"
    val b = "bar"

    val result = isIsomorphic(a, b)

    println("is Isomorphic: $result")

}

fun isIsomorphic(a: String, b: String): Boolean {
    if (a.length != b.length) {
        return false
    }
    val mMap: HashMap<Char, Char> = hashMapOf()

    a.onEachIndexed { i, char ->
        if (mMap.containsKey(char)) {
            if (mMap[char] != b[i]) {
                return false
            }
        } else {
            mMap[char] = b[i]
        }
    }

    val set: HashSet<Char> = HashSet(mMap.values)

    if (set.size == mMap.size) {
        return true
    }

    return false
}
